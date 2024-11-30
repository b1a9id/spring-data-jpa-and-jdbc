package com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response;

import java.util.List;

public record ShopResponse(
        Integer id,
        String name,
        List<UserResponse> users) {

    public record UserResponse(
            Integer id,
            String name,
            Integer age) {
    }
}
