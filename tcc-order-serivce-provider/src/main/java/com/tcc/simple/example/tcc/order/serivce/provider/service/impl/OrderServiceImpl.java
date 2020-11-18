package com.tcc.simple.example.tcc.order.serivce.provider.service.impl;

import com.tcc.simple.example.tcc.order.serivce.provider.entity.OrderEntity;
import com.tcc.simple.example.tcc.order.serivce.provider.repository.OrderRepository;
import com.tcc.simple.example.tcc.order.serivce.provider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderEntity save(OrderEntity entity) {
        OrderEntity save = orderRepository.save(entity);
        return save;
    }
}
