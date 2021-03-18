package com.ky.kevin.feign;

import com.ky.kevin.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Kevin
 * @Date: 2021/3/18 12:33 下午
 */
@FeignClient(value = "eureka-client", configuration = FeignConfiguration.class)
public interface UserRemoteClient {
    @GetMapping("/test/hello")
    String hello();
}
