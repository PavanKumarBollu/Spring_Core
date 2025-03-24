package com.pavan.beans;

public class FirstFlight implements ICourier {

	static {
		System.out.println("FirstFlight.class file is loading...");
	}

	public FirstFlight() {
		System.out.println("FirstFlight:: Zero param constructor...");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will delived with the order id :: "+oid+" for the ordered products";
	}

}
