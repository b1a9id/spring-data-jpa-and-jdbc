package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jdbc;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.jdbc.JdbcUser;

public interface JdbcUserRepository extends ListPagingAndSortingRepository<JdbcUser, Integer> {
}
