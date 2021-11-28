package com.zp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config server 要先于 config client启动
 * @author ZP
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3344.class,args);
    }
}
