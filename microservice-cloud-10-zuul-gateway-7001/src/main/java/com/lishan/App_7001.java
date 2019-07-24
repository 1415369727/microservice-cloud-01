package com.lishan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class App_7001 {
    public static void main(String[] args) {
        SpringApplication.run(App_7001.class,args);
    }
}
