package com.pavan.dto;

public class CustomerDTO {
	private String customerName;
	private String customerAddress;
	private Float principleAmount;
	private Float intrestRate;
	private Float time;

	static {
		System.out.println("CustomerDTO .calss file is loading....");

	}

	public CustomerDTO() {
		System.out.println("CustomerDTO Object got Instanciated.....");
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setPrincipleAmount(Float principleAmount) {
		this.principleAmount = principleAmount;
	}

	public void setIntrestRate(Float intrestRate) {
		this.intrestRate = intrestRate;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public Float getPrincipleAmount() {
		return principleAmount;
	}

	public Float getIntrestRate() {
		return intrestRate;
	}

	public Float getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", principleAmount=" + principleAmount + ", intrestRate=" + intrestRate + ", time=" + time + "]";
	}

}
