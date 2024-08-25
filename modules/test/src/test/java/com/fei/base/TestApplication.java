package com.fei.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 测试模块应用启动入口
 * **包扫描路径尽可能小**
 * @author
 * @version $
 */
@SpringBootApplication
public class TestApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TestApplication.class);
    }

    public static void main(String[] args) {
        new SpringApplication(TestApplication.class).run(args);
    }
}