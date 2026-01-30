package com.jeecg.modules.jmreport.config;

import com.alibaba.fastjson.JSONObject;
import org.jeecg.modules.jmreport.common.util.OkConvertUtils;
import org.springframework.security.core.context.SecurityContextImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
* @Description: api访问权限过滤器
*
* @author: wangshuai
* @date: 2024/9/25 下午6:22
*/
public class ApiSecurityConfigFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String loginFrom = req.getHeader("jm_login_from");
        if(null != loginFrom && !loginFrom.isEmpty()){
            String springSecurityContext = req.getHeader("jm_spring_security_context");
            if(null != springSecurityContext && !springSecurityContext.isEmpty()){
                SecurityContextImpl securityContext = JSONObject.parseObject(springSecurityContext, SecurityContextImpl.class);
                HttpSession session = req.getSession();
                session.setAttribute("loginFrom", loginFrom);
                session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
            }
        }
        chain.doFilter(request, response);
    }
}
