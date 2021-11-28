package com.springcloud.zp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZP
 * @date 2021/11/28 18:14
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class, args);
    }
}
