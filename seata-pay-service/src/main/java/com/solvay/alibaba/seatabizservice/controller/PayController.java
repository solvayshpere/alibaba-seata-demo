package com.solvay.alibaba.seatabizservice.controller;

import com.solvay.alibaba.seatabizservice.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public String pay(){
        payService.save();
        return "success";
    }
}
