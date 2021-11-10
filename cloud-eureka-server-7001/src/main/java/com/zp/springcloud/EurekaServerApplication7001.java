package com.zp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZP
 * @date 2021/11/9 15:32
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7001.class, args);
    }
}
