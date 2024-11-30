package com.b1a9idps.spring_data_jpa_and_jdbc;

import org.springframework.boot.SpringApplication;

public class TestSpringDataJpaAndJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
