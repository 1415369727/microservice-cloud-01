package com.lishan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lishan.mapper")
public class App_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(App_Config_8001.class,args);
    }

}
