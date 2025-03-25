package com.pavan.comp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
@PropertySource(value = "com/pavan/commons/application.properties")
public class Voter {

	@Value("${voter.info.name}")
	private String name;
	@Value("${voter.info.age}")
	private int age;
	
	private Date dov;
	
	
	
	static
	{
		System.out.println("voter .class file is loading....\n");
	}
	
	public Voter() {
		System.out.println("voter Object got Instanciated.....\n ");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Voter.myInit() method Got Called....\n");
		dov = new Date();
		boolean flag = false;
		if(name == null)
		{
			System.out.println("name Must Not be null....\n");
			flag =true;
		}
		if(age<0)
		{
			age *= -1;
		}
		if(age >=100)
		{
			System.out.println("Age Must not be more than 100 ....\n");
			flag = true;
		}
		if(flag)
		{
			throw new IllegalArgumentException("Invalid Input");
		}
	}

	
	
	
	public String checkEligibility()
	{
		
		System.out.println("Voter.checkEligibility() method got called...\n");
		if(age >= 18)
			return "Mr/Miss/Mrs: " + name + " u r eligibile for voting: " + age + " ---> on " + dov + "\n";
		else
			return "Mr/Miss/Mrs: " + name + " u r Not eligibile for voting: " + age + " ---> on " + dov + "\n";
			
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("Voter.myDestroy() method Got Called...\n");
		name= null;
		age =0;
		dov = null;
		
		
	}
	

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	
	
	
}
