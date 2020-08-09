package com.springcloud.lean.microgoods.service.impl;

import com.springcloud.lean.microgoods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {

    AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public String queryGoods() {
        atomicInteger.getAndAdd(1);
        log.info("queryGoods..."+atomicInteger.get());
        return "queryGoods";
    }
}
