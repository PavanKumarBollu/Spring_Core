package com.pavan.messagebean;

import java.util.Date;

public class WishMessageGenarator {
	private Date date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenarator() {
		System.out.println("WishMessageGenerator object is instantiated using :: Zero param constructor");
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform Setter injection...");
		System.out.println(this);
	}

	public String toString() {
		return "WishMessageGenarator [date=" + date + "]" + date.hashCode();
	}

		
	
	}
	
