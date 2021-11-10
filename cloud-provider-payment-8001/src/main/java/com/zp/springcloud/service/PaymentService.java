package com.zp.springcloud.service;


import com.zp.springcloud.entity.po.Payment;

/**
 * @author ZP
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById( Long id);

    Payment getPaymentTimeoutById( Long id);
}
