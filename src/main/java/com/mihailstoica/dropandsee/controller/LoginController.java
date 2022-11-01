package com.mihailstoica.dropandsee.controller;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.shared.CurrentUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/1.0/login")
public class LoginController {
    @PostMapping
    public Map<String, Object> handleLogin(@CurrentUser User loggedInUser) {
        return Collections.singletonMap("id", loggedInUser.getId());
    }
}
