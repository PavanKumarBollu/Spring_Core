package com.pavan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value="application.properties")
public class PersistenceConfig {
	@Autowired
	private Environment env;
	
	static
	{
		System.out.println("PersistenceConfig .class File is loading.....\n");
	}

	public PersistenceConfig() {
		System.out.println("PersistenceConfig Object Instantiaten.....\n");
	}
	
	@Bean(value="dataSource")
	public HikariDataSource getDataSource()
	{
		System.out.println("DataSource Bean Got Created By Using @Bean Annotation.....\n");
		System.out.println("Implementation Class of DataSource Object Is: " +env.getClass().getName() + ".....\n");
	
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setMinimumIdle(Integer.parseInt(env.getProperty("jdbc.minimumIdle")));
		dataSource.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.maximumPoolSize")));
		dataSource.setConnectionTimeout(Integer.parseInt(env.getProperty("jdbc.connectionTimeOut")));
		return dataSource;
	}
	
	

}
