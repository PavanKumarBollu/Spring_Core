package com.pavan.messagebean;

import java.util.Date;

public class WishMessageGenarator {
	private Date date = null;

	public WishMessageGenarator() {
		System.out.println("WishMessageGenarator Object got instansiated.....");
	}
	
	
	
	@Override
	public String toString() {
		return "WishMessageGenarator [date=" + date + "]";
	}



	public void setDate(Date date) {
		System.out.println("setter method got called and Object got injucted....");
		this.date = date;
	}



	public String wishUser(String userName)
	{
		@SuppressWarnings("deprecation")
		int hour = date.getHours();
		
		if(hour <= 12)
		{
			return "\nGood Morning " + userName;
		}else if(hour <= 16)
		{
			return "\nGood Afternoon " + userName;
		}
		else if(hour <= 18)
		{
			return "\n Good Evening " + userName;
		}
		else
		{
			return "\nGood Night " + userName;
		}
		
	
	}
	
	
}
