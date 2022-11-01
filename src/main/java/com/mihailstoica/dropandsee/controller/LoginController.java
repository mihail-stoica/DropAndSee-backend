package com.mihailstoica.dropandsee.controller;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.shared.CurrentUser;
import com.mihailstoica.dropandsee.viewmodel.UserVM;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/login")
public class LoginController {
    @PostMapping
    UserVM handleLogin(@CurrentUser User loggedInUser) {
       return new UserVM(loggedInUser);
    }
}
