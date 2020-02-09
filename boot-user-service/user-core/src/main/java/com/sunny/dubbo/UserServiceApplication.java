package com.sunny.dubbo; /**
 * FileName: com.sunny.dubbo.serviceimpl.UserServiceApplication Author:   sunny Date:     2020/2/10 2:16 Description: 服务提供者启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈服务提供者启动类〉
 *
 * @author sunny
 * @create 2020/2/10
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.sunny.dubbo"})
@EnableDubbo
public class UserServiceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UserServiceApplication.class);
    }

}
