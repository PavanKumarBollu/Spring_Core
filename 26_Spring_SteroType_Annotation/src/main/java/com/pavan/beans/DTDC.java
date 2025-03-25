package com.pavan.beans;

import org.springframework.stereotype.Component;

@Component(value="dtdc")
public class DTDC implements ICourier {

	static {
		System.out.println("DTDC.class file is loading...");
	}

	public DTDC() {
		System.out.println("DTDC:: Zero param constructor...");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will delived with the order id :: "+oid+" for the ordered products";
	}
	@Override
	public String returns(int oid) {
		System.out.println("DTDC.returns()");
		return "DTDC Courier will pickup Your Order with the order id :: "+oid+" for the ordered products";
	}
}
