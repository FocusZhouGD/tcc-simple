package com.tcc.simple.example.tcc.order.serivce.provider.controller;

import com.tcc.simple.example.tcc.order.serivce.provider.entity.OrderEntity;
import com.tcc.simple.example.tcc.order.serivce.provider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderControllerProvider {
    @Autowired
    private OrderService orderService;
    @GetMapping("/getOrder")
    public String getOrder() {
        return "order test data";
    }

    @PostMapping("/testAdd")
    public String testAdd(@RequestBody OrderEntity entity){
        OrderEntity save = orderService.save(entity);
        return save.toString();
    }
}
