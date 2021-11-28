package com.zp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author ZP
 * @date 2021/11/27 20:03
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3355.class, args);
    }
}
