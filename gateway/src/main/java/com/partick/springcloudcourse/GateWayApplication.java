package com.partick.springcloudcourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author partick_peng
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {

    private static final Logger LOG = LoggerFactory.getLogger(GateWayApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(GateWayApplication.class);
        ConfigurableEnvironment environment = application.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("GateWay地址: \thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}
