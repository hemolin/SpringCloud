package com.springcloud.lean.microconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class MicroConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroConfigApplication.class, args);
    }

}
