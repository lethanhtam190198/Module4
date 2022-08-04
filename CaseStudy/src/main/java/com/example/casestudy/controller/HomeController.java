package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login/formLogin";
    }

    @GetMapping("/403")
    public String error() {
        return "error/403";
    }


}
