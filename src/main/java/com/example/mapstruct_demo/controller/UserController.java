package com.example.mapstruct_demo.controller;

import com.example.mapstruct_demo.response.UserResponse;
import com.example.mapstruct_demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

}
