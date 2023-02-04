package com.project.jshop.config;

import java.io.IOException;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@MapperScan(basePackages = {"com.project.jshop.repository"})
@Configuration
public class DbConfig {
	@Bean
	public HikariDataSource datasource() {
		
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("oracle.jdbc.OracleDriver");
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		config.setUsername("jshop1234");
		config.setPassword("1234");
		
		HikariDataSource dataSource = new HikariDataSource(config);
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sessionFactory() throws IOException {
		SqlSessionFactoryBean sessionFactory;
		sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		
		PathMatchingResourcePatternResolver resolver = 
				new PathMatchingResourcePatternResolver();

		sessionFactory.setMapperLocations(resolver.getResources("classpath:/mappers/**/*Mapper.xml"));
		return sessionFactory;
	}
}










