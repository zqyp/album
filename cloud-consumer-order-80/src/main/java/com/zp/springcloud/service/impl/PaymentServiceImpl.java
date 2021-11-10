package com.zp.springcloud.service.impl;

import com.zp.springcloud.entity.po.Payment;
import com.zp.springcloud.entity.vo.CommonResult;
import com.zp.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author ZP
 * @date 2021/11/9 16:31
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult<>(444, "-----PaymentFallbackService fall back-paymentInfoOk ,o(╥﹏╥)o\"");
    }

    @Override
    public CommonResult<Payment> getPaymentTimeoutById(Long id) {
        return new CommonResult<>(444, "-----PaymentFallbackService fall back-paymentInfoTimeOut ,o(╥﹏╥)o");
    }
}
