package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.Employee;

public class Test_ApplicationContext {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
		((AbstractApplicationContext)context).close();
		
	}

}
