package com.ky.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author kevin
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClusterApplication.class, args);
    }

}
