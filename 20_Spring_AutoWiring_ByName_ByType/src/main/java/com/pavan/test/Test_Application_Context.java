package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.Flipkart;

public class Test_Application_Context {

	public static void main(String[] args) {
		System.out.println("*****CONTAINER STARTED ****\n");
		System.out.println();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("AutoWiring By using the The byType Value....");
		
		Flipkart flipkart = context.getBean("flipkart1",Flipkart.class);
		flipkart.doShopping(new String[] {"Mobile","Laptop"}, new Float[] {25000.50f, 100000.0f});
		
		System.out.println("AutoWiring By using the The byName Value....");
		Flipkart flipkart2 = context.getBean("flipkart2",Flipkart.class);
		flipkart2.doShopping(new String[] {"M","L"}, new Float[] {25000.50f, 100000.0f});
		
		
		System.out.println("AutoWiring By using the The byConstructor Value....");
		Flipkart flipkart3 = context.getBean("flipkart3",Flipkart.class);
		flipkart3.doShopping(new String[] {"Watch","Charger"}, new Float[] {25000.50f, 100000.0f});
		
		
		System.out.println("*****CONTAINER STOPPED****\n");
		((AbstractApplicationContext)context).close();
	}

}
