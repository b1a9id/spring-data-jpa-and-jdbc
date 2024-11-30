package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.JdbcUser;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<JdbcUser> findAll() {
        return userService.findAll();
    }
}
