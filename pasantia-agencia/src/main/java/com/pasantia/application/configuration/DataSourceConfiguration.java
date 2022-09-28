package com.pasantia.application.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Value;

@Configuration
public class DataSourceConfiguration {

	@Bean
	@Primary
	public DataSource adminDataSource() {
		
		String url = "jdbc:postgresql://localhost:5432/agenciadb?currentSchema=public";
		String username = "postgres";
		String password = "holyknight";
		String driver = "org.postgresql.Driver";
		Long timeout = 2000L;
		Integer maxPoolSize = 5;
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		config.setDriverClassName(driver);
		config.setConnectionTimeout(timeout);
		config.setMaximumPoolSize(maxPoolSize);
		
		return new HikariDataSource(config);
	}
}
