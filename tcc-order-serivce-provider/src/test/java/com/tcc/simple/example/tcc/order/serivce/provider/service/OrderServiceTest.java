package com.tcc.simple.example.tcc.order.serivce.provider.service;

import com.tcc.simple.example.tcc.order.serivce.provider.entity.OrderEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    void save() {
        OrderEntity entity = new OrderEntity();
        entity.setOrderStatus(1);
        entity.setOrderStatusExt(1);
        orderService.save(entity);
    }
}