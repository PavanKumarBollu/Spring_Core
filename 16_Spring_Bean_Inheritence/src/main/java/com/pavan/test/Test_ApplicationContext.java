package com.pavan.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.CarConstructorInjection;
import com.pavan.beans.CarSetterInjection;

public class Test_ApplicationContext {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("***************Factory Started ******************");
		
		System.out.println("Bens Id:: " + Arrays.toString(context.getBeanDefinitionNames())  );
		
		
		CarSetterInjection car1 = context.getBean("car1", CarSetterInjection.class);
		System.out.println(car1);
		System.out.println();
		
		CarSetterInjection car2 = context.getBean("car2", CarSetterInjection.class);
		System.out.println(car2);
		System.out.println();
		
		CarConstructorInjection car3 = context.getBean("car3", CarConstructorInjection.class);
		System.out.println(car3);
		System.out.println();
		
		CarConstructorInjection car4 = context.getBean("car4", CarConstructorInjection.class);
		System.out.println(car4);
		System.out.println();
		
		
		
		System.out.println("***************Factory Stopped ******************");
		((AbstractXmlApplicationContext)context).close();
		
		
		
		

	}

}
