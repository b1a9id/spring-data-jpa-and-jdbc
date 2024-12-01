package com.b1a9idps.spring_data_jpa_and_jdbc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration(proxyBeanMethods = false)
@EnableJpaRepositories(
        basePackages = {
                "com.b1a9idps.spring_data_jpa_and_jdbc.application.repository.jpa"
        }
)
@EnableJpaAuditing
public class JpaConfig {
}
