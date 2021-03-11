package com.ky.kevin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Kevin
 * @Date: 2021/3/11 10:05 上午
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://eureka-client/test/hello", String.class);
    }
}
