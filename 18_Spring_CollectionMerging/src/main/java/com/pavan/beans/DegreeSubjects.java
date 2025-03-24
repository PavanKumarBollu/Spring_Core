package com.pavan.beans;

import java.util.Set;

public class DegreeSubjects {
	
	private Set<String> subjects;

	
	public void setSubjects(Set<String> sujects) {
		this.subjects = sujects;
	}


	@Override
	public String toString() {
		return "DegreeSubjects [sujects=" + subjects + "]";
	}
	
	
	
}