package com.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Super on 2017/3/10.
 */
@EnableEurekaServer //注解启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class EurekaserverApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaserverApplication.class).web(true).run(args);
    }
}
