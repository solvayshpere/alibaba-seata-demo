package com.solvay.alibaba.seatabizservice.controller;

import com.solvay.alibaba.seatabizservice.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BizController {

    @Autowired
    private BizService bizService;

    @GetMapping("/biz")
    public String test(){
        bizService.biz();
        return "success";
    }
}
