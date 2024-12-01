package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.JdbcUserRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.UserResponse;

@Service
public class UserService {

    private final JdbcUserRepository jdbcUserRepository;

    public UserService(JdbcUserRepository jdbcUserRepository) {
        this.jdbcUserRepository = jdbcUserRepository;
    }

    public List<UserResponse> findAllJdbc() {
        return jdbcUserRepository.findAllUserWithShop().stream()
                .map(user -> {
                    var shop = new UserResponse.ShopResponse(user.getShopId(), user.getShopName());
                    return new UserResponse(user.getId(), user.getName(), user.getAge(), shop);
                })
                .toList();
    }
}
