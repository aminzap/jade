package com.jade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/getAll")
    private String getAllUser() {
        return "home.html";
    }
}
