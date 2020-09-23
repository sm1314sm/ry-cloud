package com.ruoyi.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 */
@EnableRyFeignClients
@SpringCloudApplication
public class RuoYiAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiAuthApplication.class, args);
    }
}
