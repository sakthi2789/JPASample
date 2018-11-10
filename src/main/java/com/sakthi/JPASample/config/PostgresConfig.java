package com.sakthi.JPASample.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostgresConfig {
	
	 	@Value("${spring.datasource.hikari.driver-class-name}") String driverClassName;
	    @Value("${spring.datasource.url}") String url;
	    @Value("${spring.datasource.username}") String username;
	    @Value("${spring.datasource.password}") String password;
	    
	    @Bean(name = "dataSource")
	    public DataSource getDataSource() {
	        DataSource dataSource = DataSourceBuilder
					                .create()
					                .username(username)
					                .password(password)
					                .url(url)
					                .driverClassName("org.postgresql.Driver")
					                .build();
	        return dataSource;
	    }

}
