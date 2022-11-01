package com.mihailstoica.dropandsee.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/login")
public class LoginController {

    //private final LoginService loginService;

    @PostMapping
    public void handleLogin() {

    }
}
