package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 缓存设置
 */
@EnableCaching
@SpringBootApplication
public class TtlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtlsApplication.class, args);
    }

}
