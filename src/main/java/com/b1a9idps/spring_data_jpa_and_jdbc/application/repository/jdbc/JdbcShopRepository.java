package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jdbc;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.jdbc.JdbcShop;

public interface JdbcShopRepository extends ListPagingAndSortingRepository<JdbcShop, Integer> {
}
