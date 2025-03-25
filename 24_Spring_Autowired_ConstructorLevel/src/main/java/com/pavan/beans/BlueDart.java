package com.pavan.beans;

public class BlueDart implements ICourier {

	static {
		System.out.println("BlueDart.class file is loading...");
	}

	public BlueDart() {
		System.out.println("BlueDart:: Zero param constructor...");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "BlueDart Courier will delived with the order id :: "+oid+" for the ordered products";
	}
	@Override
	public String returns(int oid) {
		System.out.println("DTDC.returns()");
		return "BlueDart Courier will Puckup your order id :: "+oid+" for the ordered products";
	}
	

}
