package com.example.aliyun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/set/{name}", method = RequestMethod.GET)
    public String set(@PathVariable String name, HttpSession session) {
        session.setAttribute("name", name);
        return "ok";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(HttpSession session) {
        Object name = session.getAttribute("name");
        return "port=" + port + ",name=" + name;
    }

}
