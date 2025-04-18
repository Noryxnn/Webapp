package com.example.xotwodshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cartcontroller {

    @GetMapping("/cart")
    public String cartPage() {
        return "cart"; 
    }
}