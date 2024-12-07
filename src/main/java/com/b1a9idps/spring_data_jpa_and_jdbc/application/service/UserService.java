package com.b1a9idps.spring_data_jpa_and_jdbc.application.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.dto.UserShopDto;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jpa.JpaUserRepository;
import com.b1a9idps.spring_data_jpa_and_jdbc.presentation.dto.response.UserResponse;

@Service
public class UserService {

    private final JpaUserRepository jpaUserRepository;
    private final JdbcTemplate jdbcTemplate;

    public UserService(JpaUserRepository jpaUserRepository, JdbcTemplate jdbcTemplate) {
        this.jpaUserRepository = jpaUserRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<UserResponse> findAllJdbc() {
        RowMapper<UserShopDto> rowMapper = (rs, rowNum) -> new UserShopDto(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getInt("shop_id"),
                rs.getString("shop_name")
        );

        List<UserShopDto> userShopList = jdbcTemplate.query(
                "SELECT u.*, s.id as shop_id, s.name as shop_name FROM user u JOIN shop s ON u.shop_id = s.id",
                rowMapper
        );

        return userShopList.stream()
                .map(user -> {
                    var shop = new UserResponse.ShopResponse(user.shopId(), user.shopName());
                    return new UserResponse(user.id(), user.name(), user.age(), shop);
                })
                .toList();
    }

    public List<UserResponse> findAllJpa() {
        return jpaUserRepository.findAll().stream()
                .map(user -> {
                    var shop = new UserResponse.ShopResponse(user.getShop().getId(), user.getShop().getName());
                    return new UserResponse(user.getId(), user.getName(), user.getAge(), shop);
                })
                .toList();
    }
}
