package com.pavan.vo;

public class CustomerVo {
	private String customerName;
	private String customerAddress;
	private String principleAmount;
	private String intrestRate;
	private String time;
	
	static
	{
		System.out.println("CustomerVo .class file is Loading....");
	}
	public CustomerVo() {
		System.out.println("CustomerVo Object Instanciated....");
	}
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getCustomerAddress() {
		return customerAddress;
	}




	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}




	public String getPrincipleAmount() {
		return principleAmount;
	}




	public void setPrincipleAmount(String principleAmount) {
		this.principleAmount = principleAmount;
	}




	public String getIntrestRate() {
		return intrestRate;
	}




	public void setIntrestRate(String intrestRate) {
		this.intrestRate = intrestRate;
	}




	public String getTime() {
		return time;
	}




	public void setTime(String time) {
		this.time = time;
	}




	@Override
	public String toString() {
		return "CustomerVo [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", principleAmount=" + principleAmount + ", intrestRate=" + intrestRate + ", time=" + time + "]";
	}
	
	
	
	
	
}
