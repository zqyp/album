package com.zp.cloud.controller;

import com.zp.cloud.config.GitConfigConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import javax.annotation.Resource;

/**
 * @author ZP
 * @date 2021/11/27 20:09
 */
@RestController
public class ConfigController {

    @Resource
    private GitConfigConfiguration gitConfigConfiguration;

    @GetMapping(value = "/getConfigCenterInfo")
    public Mono<String> getConfigCenterInfo() {
        return Mono.just(gitConfigConfiguration.getInfo());
    }

}
