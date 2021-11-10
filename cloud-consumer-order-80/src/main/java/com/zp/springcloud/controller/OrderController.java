package com.zp.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
@RestController
@Slf4j
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/{id}")
    public CommonResult<Payment> paymentInfoOk(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }

    @GetMapping("/consumer/timeout/{id}")
    public CommonResult<Payment> paymentInfoTimeOut(@PathVariable("id") Long id){
        return paymentService.getPaymentTimeoutById(id);
    }

    public CommonResult<Payment> payment_Global_FallbackMethod()
    {
        return new CommonResult<>(444, "Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~");
    }

}
