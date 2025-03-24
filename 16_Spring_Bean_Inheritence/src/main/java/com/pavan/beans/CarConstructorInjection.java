package com.pavan.beans;

public class CarConstructorInjection {

	
	
	private String regNo;
	private String engineNo;
	private String model;
	private String company;
	private String type;
	private int engineCC;
	private String color;
	private String owner;
	private String fuelType;
	
		
	public CarConstructorInjection(String regNo, String engineNo, String model, String company, String type,
			int engineCC, String color, String owner, String fuelType) {
		super();
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.model = model;
		this.company = company;
		this.type = type;
		this.engineCC = engineCC;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
	}


	@Override
	public String toString() {
		return "CarConstructorInjection [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", company="
				+ company + ", type=" + type + ", engineCC=" + engineCC + ", color=" + color + ", owner=" + owner
				+ ", fuelType=" + fuelType + "]";
	}
}
