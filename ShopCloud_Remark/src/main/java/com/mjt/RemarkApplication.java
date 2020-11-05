package com.mjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  20:05
 * desription:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mjt.dao")
public class RemarkApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemarkApplication.class,args);
    }
}