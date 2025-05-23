package com.pavan.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.messagebean.WishMessageGenarator;

public class SetterInjuction_ApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		WishMessageGenarator wmgBean = factory.getBean("wmg", WishMessageGenarator.class);
		String wishMessage = wmgBean.wishUser("Pavan");
		System.out.println(wishMessage);
		
		System.out.println("\n" + wmgBean);
		factory.close();

	}

}
