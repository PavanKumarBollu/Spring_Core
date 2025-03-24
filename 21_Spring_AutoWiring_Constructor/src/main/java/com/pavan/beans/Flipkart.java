package com.pavan.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private ICourier courier = null;
	private Float discount = null;

	static {
		System.out.println("flipkart .class file is loaded ..... \n");
	}

	public Flipkart() {
		System.out.println("flipkart :: zero param Constructor got called");

	}
	public Flipkart(ICourier courier, Float discount) {
		super();
		this.courier = courier;
		this.discount = discount;
		System.out.println("Flipkart:: Two Param constructor...");
		System.out.println(this);
	}



	public String doShopping(String[] items, Float[] floats) {
		System.out.println("Flipkart.doShopping()");
		System.out.println();
		System.out.println("Implementation Class is :: " + courier.getClass().getName());
		System.out.println();
		System.out.println("discount ::" + discount);
		System.out.println();
		System.out.println();
		
		int orderId = 0;
		float billAmount = 0.0f;
		Random random = new Random();
		orderId = random.nextInt(1000);
		
		for(float price:floats)
		{
			billAmount += price;
		}
		
//		calculating the total based on the discount
		
		billAmount = billAmount - (discount / 100.0f);
		System.out.println("order Id :: " + orderId);
		
		String msg = courier.deliver(orderId);
		
		return Arrays.toString(items) + " are purchased having prices  " + Arrays.toString(floats)
		+ " with billAmount of " + billAmount + "----->" + msg;

	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
