package com.pavan.beans;

public class B {
	
	private A a;

	
	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	static {
		System.out.println("B.class file is loading...");
	}

	public B() {
		System.out.println("B:: Zero param constructor...");
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	
	

}
