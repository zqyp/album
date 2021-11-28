package com.zp.cloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 配置中心 客户端不能用 @Value 注解的形式获取值，不然动态刷新无效，只能用 @ConfigurationProperties
 * @author ZP
 * @date 2021/11/27 20:34
 */
@Data
@RefreshScope
@ConfigurationProperties(prefix = "config")
@Configuration
public class GitConfigConfiguration {

    private String info;

    private String name;

}
