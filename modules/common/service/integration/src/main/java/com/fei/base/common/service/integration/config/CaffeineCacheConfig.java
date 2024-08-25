package com.fei.base.common.service.integration.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author JoinFyc
 * @description 缓存配置
 * @date 2024-08-20
 */
@Configuration
@EnableCaching
public class CaffeineCacheConfig {

    @Bean
    public CaffeineCacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCaffeine(Caffeine.newBuilder()
                .initialCapacity(100)  // 初始容量 TODO 配置参数apollo维护
                .maximumSize(500)      // 最大容量
                .expireAfterWrite(10, TimeUnit.MINUTES) // 过期时间
                .weakKeys()           // 使用弱引用的键
                .recordStats());      // 记录统计信息
        return cacheManager;
    }
}
