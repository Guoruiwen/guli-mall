package com.gulimall.river.mallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.gulimall.river.mallmember.feign")
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
