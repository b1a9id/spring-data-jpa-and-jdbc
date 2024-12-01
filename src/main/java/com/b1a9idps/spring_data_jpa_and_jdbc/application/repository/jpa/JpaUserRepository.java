package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.jpa.JpaUser;

public interface JpaUserRepository extends JpaRepository<JpaUser, Integer> {
}
