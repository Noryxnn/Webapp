package com.example.xotwodshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class xotwodShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(xotwodShopApplication.class, args);
    }
}