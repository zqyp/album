package com.zp.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zp.springcloud.entity.po.Payment;
import com.zp.springcloud.entity.vo.CommonResult;
import com.zp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZP
 */

@RestController
@Slf4j
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/{id}")
    public CommonResult<Payment> paymentInfoOk(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHystrix",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "20000" )
    })
    @GetMapping("/consumer/timeout/{id}")
    public CommonResult<Payment> paymentInfoTimeOut(@PathVariable("id") Long id) {
        log.info("enter paymentInfoTimeOut "+ Thread.currentThread().getName());
        return paymentService.getPaymentTimeoutById(id);
    }

    public CommonResult<Payment> paymentInfoTimeOutHystrix(@PathVariable("id") Long id) {
        return new CommonResult<>(444,"没有对应记录,-- @paymentInfoTimeOutHystrix-- 查询ID: "+id,null);
    }

}
