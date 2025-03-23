package com.pavan.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.A;

public class Test_Application_Context {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("*****CONTAINER STARTED****\n");
		System.out.println();
		System.out.println();
		A a = factory.getBean("A", A.class);
		System.out.println();
		System.out.println();
		System.out.println("*****CONTAINER ENDED****\n");
	}

}
