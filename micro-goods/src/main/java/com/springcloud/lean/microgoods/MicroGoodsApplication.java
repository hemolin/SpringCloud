package com.springcloud.lean.microgoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroGoodsApplication.class, args);
    }

}
