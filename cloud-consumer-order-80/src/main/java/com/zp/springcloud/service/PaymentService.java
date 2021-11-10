package com.zp.springcloud.service;

import com.zp.springcloud.entity.po.Payment;
import com.zp.springcloud.entity.vo.CommonResult;
import com.zp.springcloud.service.impl.PaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZP
 * @date 2021/11/9 16:29
 */
@FeignClient(value = "cloud-payment-service", fallback = PaymentServiceImpl.class)
public interface PaymentService {

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/timeout/{id}")
    public CommonResult<Payment> getPaymentTimeoutById(@PathVariable("id") Long id);
}
