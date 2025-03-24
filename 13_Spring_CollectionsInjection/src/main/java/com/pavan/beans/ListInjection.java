package com.pavan.beans;

import java.util.Date;
import java.util.List;

public class ListInjection {

	public List<String> studentNames;
	public List<Date> dates;
	
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ListInjection [studentNames=" + studentNames + ", dates=" + dates + "]";
	}
	
	
}
 