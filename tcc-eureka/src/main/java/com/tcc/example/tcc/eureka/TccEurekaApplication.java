package com.tcc.example.tcc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TccEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TccEurekaApplication.class, args);
    }

}
