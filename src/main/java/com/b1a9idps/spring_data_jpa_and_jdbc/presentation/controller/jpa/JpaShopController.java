package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.controller.jpa;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.service.ShopService;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.ShopResponse;

@RestController
@RequestMapping("/jpa/shops")
public class JpaShopController {

    private final ShopService shopService;

    public JpaShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<ShopResponse> findAllJpa() {
        return shopService.findAllJpa();
    }
}
