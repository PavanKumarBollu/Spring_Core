package com.pavan.beans;

import java.util.Arrays;

public class ArrayInjection {
	
	private int[] marks;
	private String[] names;
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "ArrayInjection [marks=" + Arrays.toString(marks) + ", names=" + Arrays.toString(names) + "]";
	}
	

}
