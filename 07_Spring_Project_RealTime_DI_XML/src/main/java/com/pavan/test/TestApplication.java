package com.pavan.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pavan.controller.MainController;
import com.pavan.vo.CustomerVo;

public class TestApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the customerName:: ");
		String customerName = scanner.next();

		System.out.print("Enter the customerAddress:: ");
		String customerAddress = scanner.next();

		System.out.print("Enter the principalAmount:: ");
		String principleAmount = scanner.next();

		System.out.print("Enter the RateOfInterest:: ");
		String interestRate = scanner.next();

		System.out.print("Enter the TimePeriod:: ");
		String time = scanner.next();
		
		
		CustomerVo vo = new CustomerVo();
		
		vo.setCustomerName(customerName);
		vo.setCustomerAddress(customerAddress);
		vo.setIntrestRate(interestRate);
		vo.setPrincipleAmount(principleAmount);
		vo.setTime(time);
		
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		
		
		MainController controller = factory.getBean("customerController", MainController.class);
		System.out.println("\n************Container Started ***************");
		try {
			String result = controller.processCustomer(vo);
			System.out.println("\n"+result);
		} catch (Exception e) {
			System.out.println("Some Problem Occured Please Try Again + " + e.getMessage());
		}
		
		System.out.println("\n************Container Stopped***************");
		
		scanner.close();
	}

}
