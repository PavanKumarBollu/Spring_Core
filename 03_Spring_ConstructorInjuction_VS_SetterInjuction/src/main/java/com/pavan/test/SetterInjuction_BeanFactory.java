package com.pavan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pavan.messagebean.WishMessageGenarator;

public class SetterInjuction_BeanFactory {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("applicationContext.xml");

		WishMessageGenarator wmgBean = factory.getBean("wmg", WishMessageGenarator.class);

		String wishMessage = wmgBean.wishUser("Pavan");
		System.out.println(wishMessage);
		
		System.out.println("\n" + wmgBean);
	}

}
