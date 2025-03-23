package com.pavan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pavan.beans.Flipkart;

public class Test_BeanFactory {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");
		System.out.println();
		System.out.println();
		
		Flipkart flipkartBean = factory.getBean("flipkart", Flipkart.class);
		System.out.println(flipkartBean);
		System.out.println();
		
		String result = flipkartBean.doShopping(new String[] {"Lenovo","ThinkPad"}, new Float[] {1000.0f,2000.0f});
		
		System.out.println(result);
		System.out.println();
		System.out.println("*****CONTAINER ENDED****\n");
	}

}
