package com.socialpollingapp.controller;

import com.socialpollingapp.model.User;
import com.socialpollingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public Optional<User> loginUser(@RequestBody User user) {
        return userService.loginUser(user.getUsername(), user.getPassword());
    }
}
