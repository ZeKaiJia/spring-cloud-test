package com.ky.kevin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Kevin
 * @Date: 2021/3/18 12:33 下午
 */
@FeignClient(value = "eureka-client")
public interface UserRemoteClient {
    @GetMapping("/test/hello")
    String hello();

    @GetMapping("/test/speak")
    String speak(@RequestParam("word") String word);

    @PostMapping("/test/change")
    String change(@RequestParam("info") String info);
}
