package com.jeecg.modules.jmreport.extend;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.stp.StpUtil;
import com.jeecg.modules.jmreport.satoken.config.SecurityConfig;
import com.jeecg.modules.jmreport.satoken.util.AjaxRequestUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jeecg.modules.jmreport.api.JmReportTokenServiceI;
import org.jeecg.modules.jmreport.common.constant.JmConst;
import org.jeecg.modules.jmreport.common.expetion.JimuReportException;
import org.jeecg.modules.jmreport.common.util.JimuSpringContextUtils;
import org.jeecg.modules.jmreport.common.util.OkConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 自定义积木报表鉴权(如果不进行自定义，则所有请求不做权限控制)
 * 1.自定义获取登录token
 * 2.自定义获取登录用户
 */
@Slf4j
@Component
public class JimuReportTokenServiceImpl implements JmReportTokenServiceI {
    @Autowired
    SecurityConfig securityConfig;
    
    /**
     * 通过请求获取Token
     * @param request
     * @return
     */
    @Override
    public String getToken(HttpServletRequest request) {
        String token = null;
        try {
            token = StpUtil.getTokenValue();
        } catch (Exception e) {
            //log.warn(" SA-TOKEN，获取Token异常: {}", e.getMessage());
        }
        if(StringUtils.isEmpty(token) && request != null){
            token = request.getParameter("token");
            // 将URL上的token设置到SaToken上下文，方便后续操作
            log.debug("------SA--Init--TOKEN-----RequestPath={} ，从URL参数获取Token = {}", SaHolder.getRequest().getRequestPath(), token);
            StpUtil.setTokenValue(token);
        }
        return token;
    }

    /**
     * 通过Token获取登录人用户名
     * @param token
     * @return
     */
    @Override
    public String getUsername(String token) {
        String username = StpUtil.getLoginIdAsString();
        log.debug("------SA--TOKEN-----RequestPath={} ，Token={} , LoginId={}", SaHolder.getRequest().getRequestPath(), token, username);
        return username;
    }

    /**
     * 自定义用户拥有的角色
     *
     * @param token
     * @return
     */
    @Override
    public String[] getRoles(String token) {
        //积木内置三个角色 "admin","lowdeveloper","dbadeveloper"
        return new String[]{"admin","lowdeveloper","dbadeveloper","chat2bi"};
    }


    /**
     * 自定义用户拥有的权限指令
     * 
     * @param token
     * @return
     */
    @Override
    public String[] getPermissions(String token) {
        return new String[]{
                // ===== 大屏（仪表盘 BI）按钮权限，与 drag 模块各控制器 @RequiresPermissions 一致 =====
                "drag:datasource:testConnection", // 数据源连接测试
                "drag:datasource:saveOrUpate",    // 数据源新增/编辑
                "drag:datasource:delete",         // 数据源删除
                "drag:datasource:deleteBatch",    // 数据源批量删除
                "drag:datasource:queryById",      // 数据源详情查询
                "drag:dataset:save",              // 数据集保存
                "drag:dataset:delete",            // 数据集删除
                "drag:analysis:sql",              // SQL解析
                "drag:design:getTotalData",       // 仪表盘对Online表单展示数据
                "drag:iconlib:config",            // 图标库配置
                "onl:drag:clear:recovery",        // 清空回收站
                "onl:drag:page:delete",           // 仪表盘页面删除
                "onl:drag:category:delete",       // 仪表盘分类删除
                "onl:drag:comp:add",              // 组件新增
                "onl:drag:comp:edit",             // 组件编辑
                "onl:drag:comp:delete",           // 组件删除
                "onl:drag:comp:deleteBatch",      // 组件批量删除
                "onl:drag:getRawTableData",       // 获取原始表数据
                // ===== 积木报表按钮权限，与 jmreport 各控制器 @RequiresPermissions 一致 =====
                "jmreport:exportJob:plugin",         // 导出任务-插件
                "jmreport:exportJob:list",           // 导出任务-列表
                "jmreport:exportJob:save",           // 导出任务-保存
                "jmreport:exportJob:detail",         // 导出任务-详情
                "jmreport:exportJob:delete",         // 导出任务-删除
                "jmreport:exportJob:status",         // 导出任务-状态变更
                "jmreport:exportJob:run",            // 导出任务-执行
                "jmreport:map:add",                  // 地图-新增
                "jmreport:map:delete",               // 地图-删除
                "jmreport:reportGroup:list",         // 报表分组-列表
                "jmreport:reportGroup:detail",       // 报表分组-详情
                "jmreport:reportGroup:save",         // 报表分组-保存
                "jmreport:reportGroup:delete",       // 报表分组-删除
                "jmreport:category:add",             // 报表分类-新增
                "jmreport:category:edit",            // 报表分类-编辑
                "jmreport:category:delete",          // 报表分类-删除
                "jmreport:category:reduction",       // 报表分类-还原
                "jmreport:category:completelyDelete",// 报表分类-彻底删除
                "jmreport:category:batchMove",       // 报表分类-批量移动
                "jmreport:category:folderSort",      // 报表分类-文件夹排序
                "jmreport:design:loadTableData"      // 设计器-加载表数据
        };
    }

    /**
     * Token校验
     * @param token
     * @return
     */
    @Override
    public Boolean verifyToken(String token) {
        try {
            if(securityConfig.getEnable()!=null && !securityConfig.getEnable()){
                // 如果security.enable=false,则不进行登录校验
                return true;
            }
            StpUtil.checkLogin();
            log.debug("--SaToken verifyToken-成功！RequestPath={}，Token = {}", SaHolder.getRequest().getRequestPath(), token);
        } catch (Exception e) {
            log.debug("Token校验失败: token = {}，error:{}", token, e.getMessage());
            
            if(e instanceof NotLoginException){
                // 跳转登录页面
                try {
                    if(!AjaxRequestUtils.isAjaxRequest(JimuSpringContextUtils.getHttpServletRequest())){
                        JimuSpringContextUtils.getHttpServletResponse().sendRedirect("/login/login.html");
                    }
                } catch (Exception ex) {
                }
                return false;
            }else{
                throw new JimuReportException(e);
            }
        }
        return true;
    }

//    /**
//     *  自定义请求头
//     * @return
//     */
//    @Override
//    public HttpHeaders customApiHeader() {
//        HttpHeaders header = new HttpHeaders();
//        header.add("custom-header1", "Please set a custom value 1");
//        header.add("token", "token value 2");
//        return header;
//    }

    /**
     * 自定义租户
     *
     * @return
     */
    @Override
    public String getTenantId() {
        String headerTenantId = null;
        HttpServletRequest request = JimuSpringContextUtils.getHttpServletRequest();
        if (request != null) {
            headerTenantId = request.getHeader(JmConst.HEADER_TENANT_KEY);
            if(OkConvertUtils.isEmpty(headerTenantId)){
                headerTenantId = request.getHeader(JmConst.HEADER_TENANT_ID);
            }
            if(OkConvertUtils.isEmpty(headerTenantId)){
                headerTenantId = request.getParameter(JmConst.TENANT_ID);
            }
        }
        return headerTenantId;
    }
}