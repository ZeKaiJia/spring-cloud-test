package com.ky.kevin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Kevin
 * @Date: 2021/3/10 5:30 下午
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
