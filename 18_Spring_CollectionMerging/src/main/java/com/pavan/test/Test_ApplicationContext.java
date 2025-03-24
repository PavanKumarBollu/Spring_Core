package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.DegreeSubjects;

public class Test_ApplicationContext {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("***************Factory Started ******************");
		System.out.println("Beans Created:: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		DegreeSubjects subBean = context.getBean("degreeSubjects", DegreeSubjects.class);
		System.out.println(subBean);
		
		System.out.println("***************Factory Stopped ******************");
		
		
		
		
		
		context.close();

	}

}
