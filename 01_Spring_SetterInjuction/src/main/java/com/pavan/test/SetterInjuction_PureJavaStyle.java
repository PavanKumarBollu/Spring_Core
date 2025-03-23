package com.pavan.test;

import java.util.Date;

import com.pavan.messagebean.WishMessageGenarator;

public class SetterInjuction_PureJavaStyle {

	public static void main(String[] args) {
		WishMessageGenarator wishGenarator = new WishMessageGenarator();
		System.out.println("Target Object before Setter Injuction Is : " + wishGenarator);
		System.out.println();
		Date date = new java.util.Date();
		System.out.println("Dependent Object Is : " + date);
		System.out.println();
		wishGenarator.setDate(date);
		System.out.println("Target Object After Setter Injuction Is : " + wishGenarator);
		System.out.println();
		String wishResult = wishGenarator.wishUser("Pavan");
		System.out.println(wishResult);
	}

}
