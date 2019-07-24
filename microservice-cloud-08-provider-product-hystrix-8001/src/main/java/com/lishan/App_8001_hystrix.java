package com.lishan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
public class App_8001_hystrix {
    public static void main(String[] args) {
        SpringApplication.run(App_8001_hystrix.class,args);
    }

}
