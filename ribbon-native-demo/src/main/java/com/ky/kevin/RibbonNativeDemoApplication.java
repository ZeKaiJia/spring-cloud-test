package com.ky.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author kevin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonNativeDemoApplication {

    public static void main(String[] args) {
        try {
            System.setProperty("spring.devtools.restart.enabled", "false");
            SpringApplication.run(RibbonNativeDemoApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
