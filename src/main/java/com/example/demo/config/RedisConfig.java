package com.example.demo.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * RedisConfig
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
}
