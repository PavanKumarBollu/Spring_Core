package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.Flipkart;

public class Test_Application_Context {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("*****CONTAINER STARTED****\n");
		System.out.println("beans Names: " + Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println();

		Flipkart flipkartBean = factory.getBean("flipkart", Flipkart.class);
		System.out.println(flipkartBean);
		System.out.println();

		String result = flipkartBean.doShopping(new String[] { "Lenovo", "ThinkPad" },
				new Float[] { 1000.0f, 2000.0f });

		System.out.println(result);
		System.out.println();
		System.out.println("*****CONTAINER ENDED****\n");
		factory.close();
	}

}
