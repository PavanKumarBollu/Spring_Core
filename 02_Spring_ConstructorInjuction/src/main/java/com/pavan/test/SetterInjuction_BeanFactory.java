package com.pavan.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pavan.messagebean.WishMessageGenarator;

@SuppressWarnings("deprecation")
public class SetterInjuction_BeanFactory {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
//		System.out.println("Before Injucting");

		WishMessageGenarator wmgBean = factory.getBean("wmg", WishMessageGenarator.class);

		String wishMessage = wmgBean.wishUser("Pavan");
		System.out.println(wishMessage);
	}

}
