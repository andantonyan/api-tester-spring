package com.andantonyan.apitester.common.interceptor;

import feign.RequestInterceptor;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration()
public class DefaultInterceptor {
    @Bean
    RequestInterceptor getInterceptor() {
        return requestTemplate -> {
        };
    }
}
