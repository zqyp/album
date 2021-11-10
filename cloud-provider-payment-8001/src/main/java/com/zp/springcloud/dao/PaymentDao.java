package com.zp.springcloud.dao;

import com.zp.springcloud.entity.po.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author ZP
 */
@Mapper
public interface PaymentDao {

     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
