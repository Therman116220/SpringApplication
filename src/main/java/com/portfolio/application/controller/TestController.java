package com.portfolio.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/test")
    public String showTest() {
        return "test";
    }
}
