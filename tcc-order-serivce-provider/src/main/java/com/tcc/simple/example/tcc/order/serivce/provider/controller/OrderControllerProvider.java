package com.tcc.simple.example.tcc.order.serivce.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControllerProvider {
    @GetMapping("/getOrder")
    public String getOrder() {
        return "order test data";
    }
}
