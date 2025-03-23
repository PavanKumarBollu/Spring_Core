package com.pavan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pavan.beans.A;

public class Test_BeanFactory {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");
		System.out.println();
		System.out.println();
		
		A aBean = factory.getBean("a", A.class);
		System.out.println();
		System.out.println();
		System.out.println("*****CONTAINER ENDED****\n");
	}

}
