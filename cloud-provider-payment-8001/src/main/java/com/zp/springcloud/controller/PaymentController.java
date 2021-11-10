package com.zp.springcloud.controller;

import com.zp.springcloud.entity.po.Payment;
import com.zp.springcloud.entity.vo.CommonResult;
import com.zp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @author ZP
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<?> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult<>(200, "插入数据库成功,serverPort: " + serverPort, result);
        }else{
            return new CommonResult<>(444,"插入数据库失败,serverPort: "+serverPort,null);
        }
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            return new CommonResult<>(200,"查询成功,serverPort: "+serverPort,payment);
        }else{
            return new CommonResult<>(444,"没有对应记录,查询ID: "+id,null);
        }
    }


    @GetMapping("/payment/timeout/{id}")
    public CommonResult<Payment> getPaymentTimeoutById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentTimeoutById(id);

        if(payment != null)
        {
            return new CommonResult<>(200,"查询成功,serverPort: "+serverPort,payment);
        }else{
            return new CommonResult<>(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        services.forEach(service ->log.info("****element***:{}", service));

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(
                instance -> log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri())
        );

        return this.discoveryClient;
    }

}
