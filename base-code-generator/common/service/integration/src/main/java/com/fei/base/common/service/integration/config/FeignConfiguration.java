package com.fei.base.common.service.integration.config;

import feign.okhttp.OkHttpClient;
import okhttp3.Protocol;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import okhttp3.OkHttpClient.Builder;

import java.util.Arrays;

/**
 * 配置feign，建议扫包路径调至尽可能小
 *
 * @author fei
 * @date 2020-09-22 16:16
 **/
@Configuration
public class FeignConfiguration {

    @Bean
    public OkHttpClient feignClient() {
        okhttp3.OkHttpClient okHttpClient = new Builder()
                .protocols(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1))
                .build();
        return new OkHttpClient(okHttpClient);
    }
}
