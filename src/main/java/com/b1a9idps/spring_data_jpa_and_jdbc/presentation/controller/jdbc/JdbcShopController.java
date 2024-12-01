package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.controller.jdbc;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.service.ShopService;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.ShopResponse;

@RestController
@RequestMapping("/jdbc/shops")
public class JdbcShopController {

    private final ShopService shopService;

    public JdbcShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<ShopResponse> findAllJdbc() {
        return shopService.findAllJdbc();
    }
}
