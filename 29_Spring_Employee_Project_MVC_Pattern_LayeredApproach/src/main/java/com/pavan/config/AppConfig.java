package com.pavan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.pavan"})
@Import(value = PersistenceConfig.class)
public class AppConfig {
	
	static
	{
		System.out.println("AppConfig .class file is loading.....\n");
	}

	public AppConfig()
	{
		System.out.println("AppConfig Zero  Para Constructor got Called.....\n");
	}
}
