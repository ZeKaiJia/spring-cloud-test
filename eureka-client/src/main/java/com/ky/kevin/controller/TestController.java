package com.ky.kevin.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Kevin
 * @Date: 2021/3/10 5:30 下午
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/infos")
    public Object serviceUrl() {
        return eurekaClient.getInstancesByVipAddress("eureka-client", false);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
