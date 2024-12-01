package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jdbc;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.dto.UserShopDto;
import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.jdbc.JdbcUser;

public interface JdbcUserRepository extends ListPagingAndSortingRepository<JdbcUser, Integer> {
    @Query("SELECT u.*, s.id as shop_id, s.name as shop_name FROM user u JOIN shop s ON u.shop_id = s.id")
    List<UserShopDto> findAllUserWithShop();
}
