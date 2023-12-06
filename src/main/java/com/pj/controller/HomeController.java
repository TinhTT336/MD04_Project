package com.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/signin")
    public String signin() {
        return "signin";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

    @RequestMapping("/product-list")
    public String productList() {
        return "client/product-list";
    }

    @RequestMapping("/product-details")
    public String productDetails() {
        return "client/product-details";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "client/blog";
    }

    @RequestMapping("/blog-details")
    public String blogDetails() {
        return "client/blog-details";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "client/contact";
    }

    @RequestMapping("/wishlist")
    public String wishlist() {
        return "client/wishlist";
    }
}
