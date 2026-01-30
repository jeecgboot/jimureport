package com.jeecg.modules.jmreport.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 积木报表子系统切换处理类
 * @author chenrui
 * @date 2024/10/31 11:33
 */
@Component("jimuReportSwitchSysHandler")
public class JimuReportSysSwitchFilter implements Filter {

    // 包含积木报表
    boolean includeJimuReport = false;
    // 包含积木仪表盘
    boolean includeJimuDrag = false;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        // 判断是否包含积木报表
        try {
            Class.forName("org.jeecg.modules.jmreport.config.JmReportBaseConfig");
            includeJimuReport = true;
        } catch (ClassNotFoundException ignored) {
        }
        // 判断是否包含积木仪表盘
        try {
            Class.forName("org.jeecg.modules.drag.service.IOnlDragCompService");
            includeJimuDrag = true;
        } catch (ClassNotFoundException ignored) {
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpSession session = httpRequest.getSession();
            if(includeJimuReport) {
                session.setAttribute("switchJimuReport", "true");
            }else{
                session.setAttribute("switchJimuReport", "false");
            }
            if(includeJimuDrag) {
                session.setAttribute("switchJimuDrag", "true");
            }else {
                session.setAttribute("switchJimuDrag", "false");
            }
        }
        chain.doFilter(request, response);
    }


}
