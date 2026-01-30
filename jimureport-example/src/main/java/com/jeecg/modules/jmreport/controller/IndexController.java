package com.jeecg.modules.jmreport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 积木报表-设置默认首页跳转
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "jimureport");
        return "jmreport/list"; // 视图重定向 - 跳转
    }
}