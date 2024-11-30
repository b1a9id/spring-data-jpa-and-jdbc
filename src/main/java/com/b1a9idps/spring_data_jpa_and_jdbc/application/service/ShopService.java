package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.JpaShop;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.JpaShopRepository;

@Service
public class ShopService {

    private final JpaShopRepository jpaShopRepository;

    public ShopService(JpaShopRepository jpaShopRepository) {
        this.jpaShopRepository = jpaShopRepository;
    }

    public List<JpaShop> findAll() {
        return jpaShopRepository.findAll();
    }
}
