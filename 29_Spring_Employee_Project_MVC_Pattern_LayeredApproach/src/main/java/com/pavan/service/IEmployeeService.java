package com.pavan.service;

import com.pavan.dto.EmployeeDTO;

public interface IEmployeeService {
	public String saveEmployee(EmployeeDTO dto);
	public EmployeeDTO getEmployee(Integer eId);
	public String updateEmployee(EmployeeDTO dto);
	public String deleteEmployee(Integer eId);
}
