package com.example.aliyun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloComtroller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "阿里云服务器部署测试9090!!!";
    }
}
