package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.JpaShop;

public interface JpaShopRepository extends JpaRepository<JpaShop, Integer> {
}
