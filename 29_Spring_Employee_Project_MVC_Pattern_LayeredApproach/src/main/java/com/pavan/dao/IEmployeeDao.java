package com.pavan.dao;

import com.pavan.bo.EmployeeBO;

public interface IEmployeeDao {
	public String saveEmployee(EmployeeBO bo);
	public EmployeeBO getEmployee(Integer eId);
	public String updateEmployee(EmployeeBO dto);
	public String deleteEmployee(Integer eId);
}
