package com.pavan.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = "com/pavan/commons/application.properties")
public class Flipkart {

	@Autowired
	private ICourier courier ;
	
	@Autowired
	@Qualifier("dtdc")
	private ICourier returns;

	
	@Value("${flipkart.info.discount}")
	private Float discount;
	
	
	

	public void setReturns(ICourier returns) {
		System.out.println("Flipkart.setReturns()");
		this.returns = returns;
	}

	static {
		System.out.println("flipkart .class file is loaded ..... \n");
	}

	public Flipkart() {
		System.out.println("flipkart :: zero param Constructor got called");

	}

	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
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

		for (float price : floats) {
			billAmount += price;
		}

//		calculating the total based on the discount

		billAmount = billAmount - (discount / 100.0f);
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

//		calculating the total based on the discount

		billAmount = billAmount - (discount / 100.0f);
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
