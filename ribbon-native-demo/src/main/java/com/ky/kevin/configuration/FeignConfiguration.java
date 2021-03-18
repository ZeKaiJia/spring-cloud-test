package com.ky.kevin.configuration;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;


/**
 * @Author: Kevin
 * @Date: 2021/3/18 1:45 下午
 */
public class FeignConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }
}
