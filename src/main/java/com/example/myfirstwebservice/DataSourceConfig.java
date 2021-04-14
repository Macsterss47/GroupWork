package com.example.myfirstwebservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/***
 *@author Miranda Aristotle
 **/

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("spring.datasource")
public class DataSourceConfig extends HikariConfig {
	
	@Bean
	@Primary
	public HikariDataSource dataSource() {
		HikariDataSource ds = new HikariDataSource(this);
		return ds;
	}
	
}