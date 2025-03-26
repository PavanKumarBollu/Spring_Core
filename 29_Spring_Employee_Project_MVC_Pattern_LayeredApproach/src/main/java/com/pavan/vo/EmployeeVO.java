package com.pavan.vo;

public class EmployeeVO {
	private String eId;
	private String eName;
	private String eAddress;
	private String eSalary;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
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
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "EmployeeBo [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", eSalary=" + eSalary + "]";
	}
}
