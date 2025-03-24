package com.pavan.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.messagebean.WishMessageGenarator;

public class SetterInjuction_ApplicationContext {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.in.read();

		WishMessageGenarator wmg1 = factory.getBean("wmg1", WishMessageGenarator.class);
		System.out.println(wmg1 + " available at :: " + wmg1.hashCode());

		WishMessageGenarator wmg2 = factory.getBean("wmg2", WishMessageGenarator.class);
		System.out.println(wmg2 + " available at :: " + wmg2.hashCode());

		factory.close();
	}

}
