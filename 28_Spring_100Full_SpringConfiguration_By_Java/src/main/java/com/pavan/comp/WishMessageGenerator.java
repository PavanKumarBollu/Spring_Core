package com.pavan.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component(value="wmg")
@Scope(value="singleton")
public class WishMessageGenerator {
	
	@Autowired
	@Qualifier("dt2")
	private LocalDateTime date;


	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessagGenerator obj is instantiated...");
	}

	public String generateWishMessage(String userName) {
		System.out.println("WishMessagGenerator.generateWishMessage()");
		int hour = date.getHour();
		if (hour < 12) {
			return "Good morning :: " + userName;
		} else if (hour < 16) {
			return "Good Afternoon:: " + userName;
		} else if (hour < 20) {
			return "Good Evening :: " + userName;
		} else {
			return "Good night :: " + userName;
		}
	}
	
	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
}
