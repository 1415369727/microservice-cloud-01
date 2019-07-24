package com.lishan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lishan"})
public class App_81_Feign {
    public static void main(String[] args) {
        SpringApplication.run(App_81_Feign.class,args);
    }
}
