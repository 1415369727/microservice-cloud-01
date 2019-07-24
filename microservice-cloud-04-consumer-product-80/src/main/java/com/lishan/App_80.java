package com.lishan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class App_80 {
    public static void main(String[] args) {
        SpringApplication.run(App_80.class,args);
    }
}
