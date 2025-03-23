package com.pavan.controller;

import com.pavan.dto.CustomerDTO;
import com.pavan.service.ICustomerMangtService;
import com.pavan.vo.CustomerVo;

public class MainController {
	private ICustomerMangtService service = null;

	public MainController(ICustomerMangtService service) {
		this.service = service;
		System.out.println("MainController:: 1 param constrctore ------> " + service.getClass().getName());
	}
	
	
	public String processCustomer(CustomerVo vo) throws Exception
	{
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPrincipleAmount(Float.parseFloat(vo.getPrincipleAmount()));
		dto.setIntrestRate(Float.parseFloat(vo.getIntrestRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		
		String result = service.caluculateSimpleInterest(dto);
		return result;
	}
	
	
}
