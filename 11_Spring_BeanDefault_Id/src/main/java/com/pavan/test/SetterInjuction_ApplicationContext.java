package com.pavan.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.messagebean.Student;

public class SetterInjuction_ApplicationContext {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("*********Container started**********");
		System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.in.read();

		Student stud1 = factory.getBean("com.pavan.messagebean.Student#0", Student.class);
		System.out.println(stud1);
		
		Student stud2 = factory.getBean("com.pavan.messagebean.Student#1", Student.class);
		System.out.println(stud2);

		factory.close();
		System.out.println("\n*********Container stopped**********");
	}

	
}
