package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.messagebean.WishMessageGenarator;

public class Test_ApplicationContext {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("*******Container is starting**********");

		System.out.println("No of beans is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id  is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.out.println();

		WishMessageGenarator wmg = factory.getBean("wmg", WishMessageGenarator.class);
		System.out.println("HashCode of wmg is :: " + wmg.hashCode());
		System.out.println(wmg);

		System.out.println();

		WishMessageGenarator wishMessageGenerator = factory.getBean("wishMessageGenarator", WishMessageGenarator.class);
		System.out.println("HashCode of wishMessageGenerator is :: " + wishMessageGenerator.hashCode());
		System.out.println(wishMessageGenerator);

		System.out.println("\n*******Container is closing**********");
		((AbstractApplicationContext) factory).close();
	}
}
