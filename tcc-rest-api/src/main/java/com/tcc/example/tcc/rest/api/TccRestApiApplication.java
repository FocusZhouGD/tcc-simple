package com.tcc.example.tcc.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
public class TccRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TccRestApiApplication.class, args);
    }

}
