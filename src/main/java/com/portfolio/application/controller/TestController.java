package com.portfolio.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class TestController {

    @GetMapping("test")
    public String test(Map<String, Object> model) {

        model.put("message", "Hello Tester");
        return "test";
    }
}
