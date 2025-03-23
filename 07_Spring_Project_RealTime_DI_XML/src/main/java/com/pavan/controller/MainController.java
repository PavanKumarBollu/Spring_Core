package com.pavan.controller;

import com.pavan.service.ICustomerMangtService;

public class MainController {
	private ICustomerMangtService service = null;

	public MainController(ICustomerMangtService service) {
		this.service = service;
		System.out.println("MainController:: 1 param constrctore ------> " + service.getClass().getName());
	}
	
	
	
}
