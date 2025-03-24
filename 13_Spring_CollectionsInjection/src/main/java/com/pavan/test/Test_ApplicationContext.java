package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.ArrayInjection;
import com.pavan.beans.ListInjection;
import com.pavan.beans.MapInjection;
import com.pavan.beans.PropertiesInjection;
import com.pavan.beans.SetInjection;

public class Test_ApplicationContext {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		System.out.println("********* Container started **********");
		System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
		
		ArrayInjection arrayBean = factory.getBean("arr", ArrayInjection.class);
		System.out.println(arrayBean);
		System.out.println();
		
		
		ListInjection listInj = factory.getBean("listInjection",ListInjection.class);
		
		System.out.println(listInj);
		System.out.println();
		
		
		SetInjection setInj = factory.getBean("setInjection", SetInjection.class);
		System.out.println(setInj);
		System.out.println();
		
		MapInjection mapInj = factory.getBean("mapInjection" , MapInjection.class);
		System.out.println(mapInj);
		System.out.println();
		
		PropertiesInjection prop = factory.getBean("propers", PropertiesInjection.class);
		System.out.println(prop);
		System.out.println();
		
		
		
		
		
		System.out.println();
		System.out.println("********* Container Stopped **********");
		factory.close();
	
		
	
	
	}

}
