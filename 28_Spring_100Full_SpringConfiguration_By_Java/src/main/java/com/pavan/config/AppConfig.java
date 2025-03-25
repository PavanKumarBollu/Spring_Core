package com.pavan.config;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.pavan")
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig:: Zero param constructor");
	}

	@Bean(value="dt1")
	public LocalDateTime createObj1()
	{
		System.out.println("AppConfig.createObj1()\n");
		return LocalDateTime.now();
	}
	
	@Bean(value="dt2")
	public LocalDateTime createObj2()
	{
		System.out.println("AppConfig.createObj2()\n");
		return LocalDateTime.now();
	}
	
	
	
}
