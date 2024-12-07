package com.b1a9idps.spring_data_jpa_and_jdbc.application.dto;

public record UserShopDto(
        Integer id,
        String name,
        Integer age,
        Integer shopId,
        String shopName) {
}
