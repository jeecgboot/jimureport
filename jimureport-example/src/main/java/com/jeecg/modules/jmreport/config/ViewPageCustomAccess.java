package com.jeecg.modules.jmreport.config;

import org.jeecg.modules.jmreport.common.util.OkConvertUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义view页面access处理
 * for: [TV360X-2206] 目前这个版本必须登录后才能看报表，如何设置不登录也能查看报表 #2919
 * @author chenrui
 * @date 2024/8/23 14:28
 */
@Component("viewPageCustomAccess")
public class ViewPageCustomAccess {

    @Value("${spring.security.open-view-page:false}")
    boolean openViewPage = false;

    public boolean check(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        if (null == principal || principal.toString().isEmpty() || "anonymousUser".equalsIgnoreCase(principal.toString())) {
            // 未登录
            if (openViewPage) {
                // 配置文件设置了开放view页面
                return true;
            }
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            String previousPage = httpRequest.getParameter("previousPage");
            String jmLink = httpRequest.getParameter("jmLink");
            if (null != previousPage && !previousPage.isEmpty()
                    && null != jmLink && !jmLink.isEmpty()) {
                // 参数中有previousPage和jmLink
                return true;
            }
            return false;
        }
        return true;
    }
}

