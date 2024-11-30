package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.JpaShop;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.service.ShopService;

@RestController
@RequestMapping("/shops")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<JpaShop> findAll() {
        return shopService.findAll();
    }
}
