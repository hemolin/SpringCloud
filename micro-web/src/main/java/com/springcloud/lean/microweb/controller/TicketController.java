package com.springcloud.lean.microweb.controller;

import com.springcloud.lean.microweb.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping("queryGoods")
    public String queryGoods() {
        return ticketService.queryGoods();
    }
}
