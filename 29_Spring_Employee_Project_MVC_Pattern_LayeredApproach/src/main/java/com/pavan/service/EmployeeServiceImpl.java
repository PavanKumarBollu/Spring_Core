package com.pavan.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.EmployeeBO;
import com.pavan.dao.IEmployeeDao;
import com.pavan.dto.EmployeeDTO;

@Service(value="empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;
	
	

	@Override
	public String saveEmployee(EmployeeDTO dto) {
		
		EmployeeBO bo = new EmployeeBO();
		
		BeanUtils.copyProperties(dto, bo);
//		bo.seteName(dto.geteName());
//		bo.seteAddress(dto.geteAddress());
//		bo.seteSalary(dto.geteSalary());
		
		return dao.saveEmployee(bo);
	}
	
	

	@Override
	public EmployeeDTO getEmployee(Integer eId) {
		EmployeeBO bo = dao.getEmployee(eId);//dependent
		EmployeeDTO dto = new EmployeeDTO();//target
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public String updateEmployee(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.updateEmployee(bo);
	}

	@Override
	public String deleteEmployee(Integer eId) {
		return dao.deleteEmployee(eId);
	}

}
