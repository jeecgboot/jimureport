package com.jeecg.modules.jmreport.extend;

import org.jeecg.modules.jmreport.api.JmReportTokenServiceI;
import org.jeecg.modules.jmreport.common.constant.JmConst;
import org.jeecg.modules.jmreport.common.util.JimuSpringContextUtils;
import org.jeecg.modules.jmreport.common.util.OkConvertUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义积木报表鉴权(如果不进行自定义，则所有请求不做权限控制)
 * 1.自定义获取登录token
 * 2.自定义获取登录用户
 */
@Component
public class JimuReportTokenServiceImpl implements JmReportTokenServiceI {

    /**
     * 通过请求获取Token
     * @param request
     * @return
     */
    @Override
    public String getToken(HttpServletRequest request) {
        //System.out.println("---------call---------getToken-----------------------");
        //return TokenUtils.getTokenByRequest(request);
        return "123456";
    }

    /**
     * 通过Token获取登录人用户名
     * @param token
     * @return
     */
    @Override
    public String getUsername(String token) {
        // return JwtUtil.getUsername(token);
        return "admin";
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
        return new String[]{"admin","lowdeveloper","dbadeveloper"};
    }


    /**
     * 自定义用户拥有的权限指令
     * 
     * @param token
     * @return
     */
    @Override
    public String[] getPermissions(String token) {
        //drag:datasource:testConnection   仪表盘数据库连接测试
        //onl:drag:clear:recovery          清空回收站
        //drag:analysis:sql                SQL解析
        //drag:design:getTotalData         仪表盘对Online表单展示数据
        return new String[]{"drag:datasource:testConnection","onl:drag:clear:recovery","drag:analysis:sql","drag:design:getTotalData","onl:drag:page:delete"};
    }

    /**
     * Token校验
     * @param token
     * @return
     */
    @Override
    public Boolean verifyToken(String token) {
        //System.out.println("---------verify-----Token---------------");
        //return TokenUtils.verifyToken(token, sysBaseAPI, redisUtil);
        return true;
    }

    /**
     *  自定义请求头
     * @return
     */
    @Override
    public HttpHeaders customApiHeader() {
        HttpHeaders header = new HttpHeaders();
        header.add("custom-header1", "Please set a custom value 1");
        header.add("token", "token value 2");
        return header;
    }

    /**
     * 自定义获取租户
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
        //return headerTenantId;
        return null;
    }
}