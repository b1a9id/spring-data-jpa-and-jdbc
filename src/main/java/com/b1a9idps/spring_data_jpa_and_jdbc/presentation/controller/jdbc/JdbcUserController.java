package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.controller.jdbc;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.service.UserService;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.UserResponse;

@RestController
@RequestMapping("/jdbc/users")
public class JdbcUserController {

    private final UserService userService;

    public JdbcUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserResponse> findAllJdbc() {
        return userService.findAllJdbc();
    }
}
