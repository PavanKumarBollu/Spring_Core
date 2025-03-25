package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.comp.Voter;

public class ClientApp {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("***** Container Started *****\n");
		System.out.println("Beans Names : " + Arrays.toString(context.getBeanDefinitionNames()) + "\n");
		Voter voterBean = context.getBean(Voter.class);
		System.out.println(voterBean + "\n");
		
		String result = voterBean.checkEligibility();
		System.out.println(result+ "\n");
		
		
		System.out.println("***** Container Stopped *****\n");
		((AbstractApplicationContext)context).close();
	}
}
