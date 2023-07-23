package com.microservices.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGWApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(ApiGWApplication.class, args);
    }
}