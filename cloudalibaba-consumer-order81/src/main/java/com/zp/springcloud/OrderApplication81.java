package com.zp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZP
 * @date 2021/11/14 15:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderApplication81 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication81.class, args);
    }
}
