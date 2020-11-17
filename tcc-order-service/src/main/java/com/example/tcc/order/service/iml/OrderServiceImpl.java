package com.example.tcc.order.service.iml;

import com.example.tcc.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrder() {
        return "test order service";
    }
}
