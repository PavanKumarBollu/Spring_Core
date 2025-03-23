package com.pavan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pavan.beans.Student;

public class ConstructorInjuction_AttributeTypes {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		System.out.println("****Container started*****");
		
		
		Student std1 = factory.getBean("std1", Student.class);
		System.out.println(std1);

		System.out.println();

		Student std2 = factory.getBean("std2", Student.class);
		System.out.println(std2);

		System.out.println();

		Student std3 = factory.getBean("std3", Student.class);
		System.out.println(std3);
		
		System.out.println();
		
		Student std4 = factory.getBean("std4", Student.class);
		System.out.println(std4);
		
		System.out.println("**** Container Stopped *****");
	}

}
