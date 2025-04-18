package com.example.xotwodshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logincontroller {
   
    @GetMapping("/login")
    public String loginPage() {
        return "loginpage";
    }
}