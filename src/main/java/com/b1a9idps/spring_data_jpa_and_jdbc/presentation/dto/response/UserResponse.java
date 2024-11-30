package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response;

public record UserResponse(
        Integer id,
        String name,
        Integer age,
        ShopResponse shop) {

    public record ShopResponse(Integer id, String name){
    }
}
