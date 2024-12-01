package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.JdbcUser;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.JdbcUserRepository;

@Service
public class UserService {

    private final JdbcUserRepository jdbcUserRepository;

    public UserService(JdbcUserRepository jdbcUserRepository) {
        this.jdbcUserRepository = jdbcUserRepository;
    }

    public List<JdbcUser> findAllJdbc() {
        return jdbcUserRepository.findAll(Sort.by("id"));
    }
}
