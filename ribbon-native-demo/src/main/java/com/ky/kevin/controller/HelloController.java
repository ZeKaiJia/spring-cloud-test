package com.ky.kevin.controller;

import com.google.common.collect.Lists;
import com.ky.kevin.feign.UserRemoteClient;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import com.netflix.loadbalancer.reactive.ServerOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * @Author: Kevin
 * @Date: 2021/3/11 10:05 上午
 */
@RestController
@RequestMapping("/article")
public class HelloController {
    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callHello")
    private String callHello() {
        return userRemoteClient.hello();
    }

    @GetMapping("/callSpeak")
    private String callSpeak(@RequestParam("word") String word) {
        return userRemoteClient.speak(word);
    }

    @PostMapping("/callChange")
    private String callChange(@RequestParam("info") String info) {
        return userRemoteClient.change(info);
    }
}
