package com.pavan.bo;

public class EmployeeBO {
	
	private Integer eId;
	private String eName;
	private String eAddress;
	private Integer eSalary;
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public Integer geteSalary() {
		return eSalary;
	}
	public void seteSalary(Integer eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "EmployeeBO [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", eSalary=" + eSalary + "]";
	}
	
}
