package com.zp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZP
 * @date 2021/11/14 16:45
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication3377.class,args);
    }
}
