package com.pavan.beans;

public class Student {

	
	private String name;
	private Integer age;
	private String address;
	private Float height;
	
	static
	{
		System.out.println("Student .class File is Loaded");
	}
	
	
	
	public Student(String name, Integer age, String address, Float height) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		System.out.println("4 Param Constructor ...");
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", height=" + height + "]";
	}
}	
