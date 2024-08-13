package com.zerobase.openbanking_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login/oauth")
    public String login() {
        return "oauth-authorize";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
