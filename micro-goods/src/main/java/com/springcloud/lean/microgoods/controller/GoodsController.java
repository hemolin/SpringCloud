package com.springcloud.lean.microgoods.controller;

import com.springcloud.lean.microgoods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    Environment environment;

    @Value("${server.port}")
    String port;
    @Value("${username}")
    String username;
//    @Value("${passwd}")
//    String passwd;

    @RequestMapping("queryGoods")
    public String queryGoods() {
        log.info(String.format("queryGoods: port=%s", port));
        log.info(String.format("environment->username=%s", environment.getProperty("username")));
//        log.info(String.format("@Value->username=%s, passwd=%s", username, passwd));
        return goodsService.queryGoods();
    }
}
