package com.pavan.test;

import java.util.Date;

import com.pavan.messagebean.WishMessageGenarator;

public class SetterInjuction_PureJavaStyle {

	public static void main(String[] args) {
		Date date = new java.util.Date();
		System.out.println("Dependent Object Is : " + date);
		System.out.println("Creating an Object of Dependant class using Zero param constructor :: " + date);
		WishMessageGenarator wishGenarator = new WishMessageGenarator(date );
		System.out.println();
		System.out.println();
		wishGenarator.setDate(date);
		System.out.println("Target Object After Constructor Injuction Is : " + wishGenarator);
		System.out.println();
		String wishResult = wishGenarator.wishUser("Pavan");
		System.out.println(wishResult);
	}

}
