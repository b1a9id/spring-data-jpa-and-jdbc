package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.Shop;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.ShopRepository;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<Shop> findAll() {
        return shopRepository.findAll();
    }
}
