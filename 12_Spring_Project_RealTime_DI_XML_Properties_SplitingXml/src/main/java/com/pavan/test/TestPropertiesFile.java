package com.pavan.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestPropertiesFile {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DriverManagerDataSource dataSource = (DriverManagerDataSource) context.getBean("dataSource");
        System.out.println("JDBC URL: " + dataSource.getUrl());
	}

}
