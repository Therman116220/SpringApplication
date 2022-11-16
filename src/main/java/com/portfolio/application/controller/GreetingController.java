package com.portfolio.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

@GetMapping("portfolio")
                       /* Map:String/Object Pair, w/ parameter name of "model" because it's passed to model */
public String greeting(Map<String, Object> model) {
    model.put("name", "Welcome ");
    return "portfolio";/*Once again JSP goes here*/
}}

