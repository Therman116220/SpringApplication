package com.portfolio.application.controller;


import com.portfolio.application.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

@Controller
public class RegistrationController {


    @GetMapping("registration")
                                               /*URL:Reg , called model.Reg w/ an instance of reg*/
    public String getRegistration(@ModelAttribute ("registration")Registration registration) {

        return "registration";
    }
}
