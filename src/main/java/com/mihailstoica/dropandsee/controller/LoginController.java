package com.mihailstoica.dropandsee.controller;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.shared.CurrentUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/login")
public class LoginController {
    @PostMapping
    User handleLogin(@CurrentUser User loggedInUser) {
        User user = new User();
        user.setId(loggedInUser.getId());
        user.setUsername(loggedInUser.getUsername());
        user.setDisplayName(loggedInUser.getDisplayName());
        user.setImage(loggedInUser.getImage());
        return user;
    }
}
