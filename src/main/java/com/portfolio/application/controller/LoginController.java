package com.portfolio.application.controller;

import com.portfolio.application.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("login")

    public String getLogin(@ModelAttribute("login") Login login) {
        return "login";
    }

@PostMapping("login")
    System.out.println("Login:" login.getId())")


}
