package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jdbc.JdbcShopRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jpa.JpaShopRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.ShopResponse;

@Service
public class ShopService {

    private final JpaShopRepository jpaShopRepository;
    private final JdbcShopRepository jdbcShopRepository;

    public ShopService(JpaShopRepository jpaShopRepository, JdbcShopRepository jdbcShopRepository) {
        this.jpaShopRepository = jpaShopRepository;
        this.jdbcShopRepository = jdbcShopRepository;
    }

    public List<ShopResponse> findAllJpa() {
        return jpaShopRepository.findAll().stream()
                .map(shop -> {
                    var users = shop.getUsers().stream()
                            .map(user -> new ShopResponse.UserResponse(user.getId(), user.getName(), user.getAge()))
                            .toList();
                    return new ShopResponse(shop.getId(), shop.getName(), users);
                })
                .toList();
    }

    public List<ShopResponse> findAllJdbc() {
        return jdbcShopRepository.findAll(Sort.by("id")).stream()
                .map(shop -> {
                    var users = shop.getUsers().stream()
                            .map(user -> new ShopResponse.UserResponse(user.getId(), user.getName(), user.getAge()))
                            .toList();
                    return new ShopResponse(shop.getId(), shop.getName(), users);
                })
                .toList();
    }
}
