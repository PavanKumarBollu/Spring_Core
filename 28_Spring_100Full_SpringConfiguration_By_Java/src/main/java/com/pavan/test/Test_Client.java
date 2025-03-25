package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pavan.comp.WishMessageGenerator;
import com.pavan.config.AppConfig;

public class Test_Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("***** Container Started *****\n");
		System.out.println("Beans Names : " + Arrays.toString(context.getBeanDefinitionNames()) + "\n");
		
		WishMessageGenerator wmgBean = context.getBean("wmg", WishMessageGenerator.class);
		
		String result = wmgBean.generateWishMessage("Pavan");
		System.out.println(result+"\n");
		
		
		
		System.out.println("***** Container Stopped *****\n");
		((AbstractApplicationContext)context).close();
	}

}
