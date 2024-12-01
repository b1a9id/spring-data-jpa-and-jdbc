package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jdbc.JdbcUserRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jpa.JpaUserRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.UserResponse;

@Service
public class UserService {

    private final JdbcUserRepository jdbcUserRepository;
    private final JpaUserRepository jpaUserRepository;

    public UserService(JdbcUserRepository jdbcUserRepository, JpaUserRepository jpaUserRepository) {
        this.jdbcUserRepository = jdbcUserRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    public List<UserResponse> findAllJdbc() {
        return jdbcUserRepository.findAllUserWithShop().stream()
                .map(user -> {
                    var shop = new UserResponse.ShopResponse(user.getShopId(), user.getShopName());
                    return new UserResponse(user.getId(), user.getName(), user.getAge(), shop);
                })
                .toList();
    }

    public List<UserResponse> findAllJpa() {
        return jpaUserRepository.findAll().stream()
                .map(user -> {
                    var shop = new UserResponse.ShopResponse(user.getShop().getId(), user.getShop().getName());
                    return new UserResponse(user.getId(), user.getName(), user.getAge(), shop);
                })
                .toList();
    }
}
