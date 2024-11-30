package com.b1a9idps.spring_data_jpa_and_jdbc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration(proxyBeanMethods = false)
@EnableJdbcRepositories
@EnableJdbcAuditing
public class JdbcConfig {
}
