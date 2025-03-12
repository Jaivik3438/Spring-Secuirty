package com.jaivik.SpringSecurityExample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String greet(HttpServletRequest httpServletRequest){

        return "Hello Guys" + httpServletRequest.getSession().getId();
    } 
}
