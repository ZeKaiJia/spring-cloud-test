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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @GetMapping("/callHello")
//    public String callHello() {
//        return restTemplate.getForObject("http://eureka-client/test/hello", String.class);
//    }
//
//    @GetMapping("/choose")
//    public Object chooseUrl() {
//        return loadBalancerClient.choose("eureka-client");
//    }
//
//    public static void main(String[] args) {
//        List<Server> serverList = Lists.newArrayList(
//                new Server("localhost", 8081),
//                new Server("localhost", 8084)
//        );
//
//        ILoadBalancer loadBalancer = LoadBalancerBuilder.newBuilder()
//                .buildFixedServerListLoadBalancer(serverList);
//
//        for (int i = 0; i < 6; i++) {
//            String result = LoadBalancerCommand.<String>builder()
//                    .withLoadBalancer(loadBalancer)
//                    .build()
//                    .submit(new ServerOperation<String>() {
//                        @Override
//                        public Observable<String> call(Server server) {
//                            try {
//                                String addr = "http://" + server.getHost() + ":" +
//                                        server.getPort() + "/test/hello";
//                                System.out.println("调用地址: " + addr);
//                                URL url = new URL(addr);
//                                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//                                conn.setRequestMethod("GET");
//                                conn.connect();
//                                InputStream in = conn.getInputStream();
//                                byte[] data = new byte[in.available()];
//                                in.read(data);
//                                return Observable.just(new String(data));
//                            } catch (Exception e) {
//                                return Observable.error(e);
//                            }
//                        }
//                    }).toBlocking().first();
//            System.out.println("调用结果: " + result);
//        }
//    }
}
