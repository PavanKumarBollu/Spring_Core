package com.pavan.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.messagebean.Printer;

public class SetterInjuction_ApplicationContext {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("*********Container started**********");
		System.in.read();

		Printer p1 = factory.getBean("printer", Printer.class);
		System.out.println(p1);
		
		Printer p2 = factory.getBean("printer", Printer.class);
		System.out.println(p2);

		
		factory.close();
		System.out.println("\n*********Container stopped**********");
	}

}
