package com.example.huyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HuyunApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuyunApplication.class, args);
    }

}
