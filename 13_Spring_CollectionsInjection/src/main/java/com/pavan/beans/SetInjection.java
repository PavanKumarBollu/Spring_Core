package com.pavan.beans;

import java.util.Date;
import java.util.Set;

public class SetInjection {
	private Set<Long> pno;
	private Set<Date> dates;
	
	
	public void setPno(Set<Long> pno) {
		this.pno = pno;
	}
	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}
	
	@Override
	public String toString() {
		return "SetInjection [pno=" + pno + ", dates=" + dates + "]";
	}
}
