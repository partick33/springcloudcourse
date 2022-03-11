package com.partick.springcloudcourse.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author partick_peng
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.partick.springcloudcourse")
@MapperScan("com.partick.springcloudcourse.server.mapper")
public class BusinessApplication {

    private static final Logger LOG = LoggerFactory.getLogger(BusinessApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BusinessApplication.class);
        ConfigurableEnvironment environment = application.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("Business地址: \thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}