package com.tcc.simple.example.tcc.rest.api.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getOrder")
    public String getOrder(){
        return restTemplate.getForEntity("http://order-service-provider/getOrder",String.class).getBody();
    }


}
