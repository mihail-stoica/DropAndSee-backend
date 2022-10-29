package com.mihailstoica.dropandsee.controller;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.service.UserService;
import com.mihailstoica.dropandsee.shared.GenericResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public GenericResponse createUser(@RequestBody User user) {
        userService.saveUser(user);
        return new GenericResponse("User saved");
    }
}
