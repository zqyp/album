package com.zp.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZP
 * @date 2021/11/14 15:11
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private int port;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos, serverPort is "+ port;
    }
}
