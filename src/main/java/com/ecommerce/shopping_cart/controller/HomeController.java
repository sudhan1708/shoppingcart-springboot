package com.ecommerce.shopping_cart.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("")
    public String indexPage(){
        return "index";
    }

}
