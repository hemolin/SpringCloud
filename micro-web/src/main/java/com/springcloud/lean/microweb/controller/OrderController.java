package com.springcloud.lean.microweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @RequestMapping("queryOrder")
    public String queryOrder(){
        log.info("queryOrder...");
        return "queryOrder";
    }
}
