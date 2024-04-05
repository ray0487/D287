package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutScreenController {
    private String aboutscreen;

    @GetMapping("/aboutscreen.html")
    public String aboutscreen() {
        return "aboutscreen";
    }
@GetMapping("/mainscreen.html")
    public String mainscreen() {
        return "mainscreen";
    }
}
