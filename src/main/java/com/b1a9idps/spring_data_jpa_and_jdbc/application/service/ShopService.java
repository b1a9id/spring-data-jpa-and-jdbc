package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.JpaShopRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.ShopResponse;

@Service
public class ShopService {

    private final JpaShopRepository jpaShopRepository;

    public ShopService(JpaShopRepository jpaShopRepository) {
        this.jpaShopRepository = jpaShopRepository;
    }

    public List<ShopResponse> findAll() {
        return jpaShopRepository.findAll().stream()
                .map(shop -> {
                    var users = shop.getUsers().stream()
                            .map(user -> new ShopResponse.UserResponse(user.getId(), user.getName(), user.getAge()))
                            .toList();
                    return new ShopResponse(shop.getId(), shop.getName(), users);
                })
                .toList();
    }
}
