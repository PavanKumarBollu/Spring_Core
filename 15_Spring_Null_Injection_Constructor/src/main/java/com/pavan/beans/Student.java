package com.pavan.beans;

import java.util.Date;

public class Student {
	
	private Integer pid;
	private String pname;
	private String paddress;
	private Date dob;
	private Date dom;
	private Date doj;
	
	
	
	@Override
	public String toString() {
		return "Student [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + ", dom=" + dom
				+ ", doj=" + doj + "]";
	}



	public Student(Integer pid, String pname, String paddress, Date dob, Date dom, Date doj) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}
		
	
}
