package com.pavan.bo;

public class CustomerBO {
	
	private String customerName;
	private String customerAddress;
	private Float principleAmount;
	private Float intrestRate;
	private Float time;
	private Float intrestAmount;
	
	
	static
	{
		System.out.println("CustomerBO .class file is loading....");
	}
	
	public CustomerBO()
	{
		System.out.println("CustomerBO Default Constructor Got Called....");
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





	public void setIntrestAmount(Float intrestAmount) {
		this.intrestAmount = intrestAmount;
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





	public Float getIntrestAmount() {
		return intrestAmount;
	}





	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", principleAmount=" + principleAmount + ", intrestRate=" + intrestRate + ", time=" + time
				+ ", intrestAmount=" + intrestAmount + "]";
	}
	
	
	
	

}
