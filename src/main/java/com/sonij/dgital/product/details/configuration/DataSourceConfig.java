package com.sonij.dgital.product.details.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/soni_j");
		source.setUsername("root");
		source.setPassword("root");
		return source;
	}
	
	@Bean
	public NamedParameterJdbcTemplate getJdbcTemplate(DriverManagerDataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}

}
