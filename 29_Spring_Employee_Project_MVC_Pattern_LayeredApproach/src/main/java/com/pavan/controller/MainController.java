package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pavan.dto.EmployeeDTO;
import com.pavan.service.IEmployeeService;
import com.pavan.vo.EmployeeVO;

@Component(value="controller")
public class MainController {
	
	@Autowired
	private IEmployeeService service;
	
	
	/* convert the vo object into dto object and call the service layer save
	*	employee method with that dto object
	*/
	
	
	public String saveEmployee(EmployeeVO vo) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.seteName(vo.geteName());
		dto.seteAddress(vo.geteAddress());
		dto.seteSalary(Integer.parseInt(vo.geteSalary()));		
		return service.saveEmployee(dto);
	}
	
	
	
	public EmployeeVO getEmployee(Integer eId) {
		//convert the dto object into voo object and send that vo object to the view part
		EmployeeDTO dto = service.getEmployee(eId);
		EmployeeVO vo = new EmployeeVO();
		vo.seteId(dto.geteId().toString());
		vo.seteName(dto.geteName());
		vo.seteAddress(dto.geteAddress());
		vo.seteSalary(dto.geteSalary().toString());
		
		return vo;
		
	}
	public String updateEmployee(EmployeeVO vo) {
		
		return null;
	}
	public String deleteEmployee(Integer eId) {
		
		return null;
	}

}
