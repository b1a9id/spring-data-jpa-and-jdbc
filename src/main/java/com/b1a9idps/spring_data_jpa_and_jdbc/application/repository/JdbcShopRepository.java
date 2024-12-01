package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.JdbcShop;

public interface JdbcShopRepository extends ListPagingAndSortingRepository<JdbcShop, Integer>, CrudRepository<JdbcShop, Integer> {
}
