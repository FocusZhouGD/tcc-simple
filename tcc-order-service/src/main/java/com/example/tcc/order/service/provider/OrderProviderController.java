package com.example.tcc.order.service.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProviderController {

    @GetMapping("/getOrder")
    public String getOrder() {
        return "order test data";
    }
}
