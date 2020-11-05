package com.example.huyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.example.huyun.mapper")
public class HuyunApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuyunApplication.class, args);
    }

}
