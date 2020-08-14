package com.springcloud.lean.microweb.controller;

import com.springcloud.lean.microweb.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    static String SERVER_NAME = "micro-goods";

    public static boolean canVisitDB = true;

    @RequestMapping("queryGoods")
    public String queryGoods(){
        log.info("controller->queryGoods...");
        String result =  goodsService.queryGoods();
        return result;
    }

    @RequestMapping("/db/{can}")
    public boolean setDB(@PathVariable boolean can){
        this.canVisitDB = can;
        return can;
    }
}
