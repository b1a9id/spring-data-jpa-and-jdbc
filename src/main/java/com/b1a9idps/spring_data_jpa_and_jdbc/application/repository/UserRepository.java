package com.b1a9idps.spring_data_jpa_and_jdbc.application.repository;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.b1a9idps.spring_data_jpa_and_jdbc.application.entity.User;

public interface UserRepository extends ListPagingAndSortingRepository<User, Integer> {
}
