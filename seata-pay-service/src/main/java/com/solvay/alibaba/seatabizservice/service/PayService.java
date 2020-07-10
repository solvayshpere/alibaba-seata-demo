package com.solvay.alibaba.seatabizservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PayService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void save(){
        jdbcTemplate.update("INSERT INTO `pay`( `username`) VALUES ('123');");
    }
}
