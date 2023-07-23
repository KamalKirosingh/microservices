package com.microservices.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.microservices.amqp",
                "com.microservices.notification"
        }
)

public class NotificationApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(NotificationApplication.class, args);
    }
}