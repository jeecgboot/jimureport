package com.jeecg.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 积木报表独立服务启动类
 */
@SpringBootApplication(scanBasePackages = {"org.jeecg", "com.jeecg"})
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class JimuReportApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(JimuReportApplication.class, args);
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.containsProperty("server.servlet.context-path")?env.getProperty("server.servlet.context-path"):"";
        String currentEncoding = System.getProperty("file.encoding", "UTF-8");
        if(!currentEncoding.equalsIgnoreCase("UTF-8")){
            // 默认编码不是UTF-8设置为UTF-8
            System.setProperty("file.encoding", "UTF-8");
        }
        System.out.println("\n----------------------------------------------------------\n\t" +
                "JimuReport 积木报表平台 is running!  Access URL:\n\t" +
                "报表工作台: \t\thttp://localhost:" + port + path + "/jmreport/list\n\t" +
                "BI大屏工作台: \t\thttp://localhost:" + port + path + "/drag/list\n\t" +
                "----------------------------------------------------------");
    }

}
