package com.mjt;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  11:20
 * desription:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mjt.dao")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}