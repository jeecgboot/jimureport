package com.jeecg.modules.jmreport.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 自定义springsecurity登录成功处理
 * [TV360X-1884]jimureport-example集成简单的 spring security，设置登录账号密码
 * @author chenrui
 * @date 2024/8/2 16:26
 */
@Slf4j
public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("loginFrom", "jimu_example");

        SavedRequest savedRequest = (SavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST");
        String redirectUrl = savedRequest != null ? savedRequest.getRedirectUrl() : null;

        if (redirectUrl != null) {
            try {
                URI uri = new URI(redirectUrl);
                String path = uri.getPath(); // 提取路径部分

                if (path != null && path.startsWith("/jmreport")) {
                    // 路径符合要求，执行默认跳转
                    super.onAuthenticationSuccess(request, response, authentication);
                    return;
                }
            } catch (URISyntaxException e) {
                // URL解析失败，打印日志后继续执行默认跳转
                log.error(e.getMessage(), e);
            }
        }

        // 不符合 /jmreport 开头，或 redirectUrl 为 null 或异常
        response.sendRedirect("/");
    }
}