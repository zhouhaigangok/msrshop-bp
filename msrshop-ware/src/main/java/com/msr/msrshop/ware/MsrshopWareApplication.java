package com.msr.msrshop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.msr.msrshop.ware.dao")
@SpringBootApplication
public class MsrshopWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsrshopWareApplication.class, args);
    }

}
