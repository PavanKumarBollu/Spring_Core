package com.pavan.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {

	private ICourier courier = null;

	private ICourier returns = null;

	static {
		System.out.println("flipkart .class file is loaded ..... \n");
	}

	public Flipkart() {
		System.out.println("flipkart :: zero param Constructor got called");

	}
	@Autowired
	public Flipkart(@Qualifier("dtdc")ICourier courier, @Qualifier("bDart") ICourier returns) {
		super();
		this.courier = courier;
		this.returns = returns;
	}

	

	public String doShopping(String[] items, Float[] floats) {
		System.out.println("Flipkart.doShopping()");
		System.out.println();
		System.out.println("Implementation Class is :: " + courier.getClass().getName());
		System.out.println();

		int orderId = 0;
		float billAmount = 0.0f;
		Random random = new Random();
		orderId = random.nextInt(1000);

		for (float price : floats) {
			billAmount += price;
		}
		billAmount = billAmount - (20 / 100.0f);
		System.out.println("order Id :: " + orderId);

		String msg = courier.deliver(orderId);

		return Arrays.toString(items) + " are purchased having prices  " + Arrays.toString(floats)
				+ " with billAmount of " + billAmount + "----->" + msg;

	}

	public String getReturns(String[] items, Float[] floats) {
		System.out.println("Flipkart.getReturns()");
		System.out.println();
		System.out.println("Implementation Class is :: " + returns.getClass().getName());
		System.out.println();

		int orderId = 0;
		float billAmount = 0.0f;
		Random random = new Random();
		orderId = random.nextInt(1000);

		for (float price : floats) {
			billAmount += price;
		}

		billAmount = billAmount - (20 / 100.0f);
		System.out.println("order Id :: " + orderId);

		String msg = returns.deliver(orderId);

		return Arrays.toString(items) + " are Recieved having prices  " + Arrays.toString(floats)
				+ " with billAmount of " + billAmount + "----->" + msg;
	}




	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", returns=" + returns + "]";
	}

}
