package com.ky.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kevin
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientClusterApplication.class, args);
    }

}
