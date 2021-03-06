package com.solvay.alibaba.seatabizservice.controller;

import com.solvay.alibaba.seatabizservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String order(){
        orderService.save();
        return "success";
    }
}
