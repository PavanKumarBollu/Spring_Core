package com.pavan.beans;

public class A {
	
	private B b;

	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	static {
		System.out.println("A.class file is loading...");
	}

	public A() {
		System.out.println("A:: Zero param constructor...");
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	

}
