package com.portfolio.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
/*
 * When we ask for URL "/profile or /home or in my case "/"  "
 * This "Method" gets called, then (using "model.put")we put "message" into model and returned to client
 * Finally, return "SplashPage" will look for JSP page name 🚨"SplashPage"🚨
 *
 * */


@Controller
public class GreetingController {

@GetMapping("")
                       /* Map:String/Object Pair, w/ parameter name of "model" */
public String greeting(Map<String, Object> model) {
    model.put("message", "Welcome Mike");
    return "SplashPage";/*Once again JSP goes here*/
}
}
