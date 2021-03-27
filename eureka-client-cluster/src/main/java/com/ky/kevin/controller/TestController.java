package com.ky.kevin.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

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
        System.err.println("test cluster");
        return "hello";
    }

    @GetMapping("/speak")
    public String speak(@RequestParam("word") String word) {
        return "I say " + word;
    }

    @PostMapping("/change")
    public String change(@RequestParam("info") String info) {
        return "I edit " + info;
    }
}
