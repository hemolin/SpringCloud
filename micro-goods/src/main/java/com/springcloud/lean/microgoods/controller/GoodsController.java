package com.springcloud.lean.microgoods.controller;

import com.springcloud.lean.microgoods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Value("${server.port}")
    String port;

    @RequestMapping("queryGoods")
    public String queryGoods() {
        log.info(String.format("queryGoods: port=%s", port));
        return goodsService.queryGoods();
    }
}
