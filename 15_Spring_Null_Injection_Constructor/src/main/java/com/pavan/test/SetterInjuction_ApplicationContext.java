package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.Student;

public class SetterInjuction_ApplicationContext {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("***************Factory Started ******************");
		
		Student stdBean = context.getBean("student", Student.class);
		System.out.println(stdBean);
		
		System.out.println("if You are using the setter injection by default\nif you won't specify any value then null value injected by default");
		
		
		
		
		
		System.out.println("***************Factory Stopped ******************");
		
		
		
		
		
		context.close();

	}

}
