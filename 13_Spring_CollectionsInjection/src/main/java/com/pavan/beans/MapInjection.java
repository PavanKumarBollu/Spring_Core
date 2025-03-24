package com.pavan.beans;

import java.util.Date;
import java.util.Map;

public class MapInjection {

	private Map<Integer, String> fDetails;
	private Map<String, Date> dates;
	
	
	
	public void setfDetails(Map<Integer, String> fDetails) {
		this.fDetails = fDetails;
	}

	public void setDates(Map<String, Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "MapInjection [fDetails=" + fDetails + ", dates=" + dates + "]";
	}
	
	
	
	
	
	
}
