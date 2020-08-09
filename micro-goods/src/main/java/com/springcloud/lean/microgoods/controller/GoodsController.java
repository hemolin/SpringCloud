package com.springcloud.lean.microgoods.controller;

import com.springcloud.lean.microgoods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("queryGoods")
    public String queryGoods() {
        return goodsService.queryGoods();
    }
}
