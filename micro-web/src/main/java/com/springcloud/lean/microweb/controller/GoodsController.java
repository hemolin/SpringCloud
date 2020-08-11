package com.springcloud.lean.microweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class GoodsController {

    @Autowired
    private RestTemplate restTemplate;

    static String SERVER_NAME = "micro-goods";

    public static boolean canVisitDB = true;

    @RequestMapping("queryGoods")
    public String queryGoods(){
        log.info("queryGoods...");
        String result =  restTemplate.getForObject("http://" + SERVER_NAME + "/queryGoods", String.class);
        return result;
    }

    @RequestMapping("/db/{can}")
    public boolean setDB(@PathVariable boolean can){
        this.canVisitDB = can;
        return can;
    }
}
