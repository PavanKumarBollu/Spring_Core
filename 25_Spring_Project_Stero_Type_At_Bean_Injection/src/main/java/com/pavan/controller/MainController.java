package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pavan.dto.CustomerDTO;
import com.pavan.service.ICustomerMangtService;
import com.pavan.vo.CustomerVo;

@Component(value="controller")
public class MainController {
	
	@Autowired
	@Qualifier("service")
	private ICustomerMangtService service;

	
	
	
	public String processCustomer(CustomerVo vo) throws Exception
	{
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPrincipleAmount(Float.parseFloat(vo.getPrincipleAmount()));
		dto.setIntrestRate(Float.parseFloat(vo.getIntrestRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		
		return service.caluculateSimpleInterest(dto);
	}
	
	
}
