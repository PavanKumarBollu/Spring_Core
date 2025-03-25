package com.pavan.beans;

import org.springframework.stereotype.Component;

@Component(value="fFlight")
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
		return "FirstFlight Courier will delived with the order id :: "+oid+" for the ordered products";
	}
	@Override
	public String returns(int oid) {
		System.out.println("DTDC.return()");
		return "FirstFlight Courier will pickup Your order with the order id :: "+oid+" for the ordered products";
		
	}

}
