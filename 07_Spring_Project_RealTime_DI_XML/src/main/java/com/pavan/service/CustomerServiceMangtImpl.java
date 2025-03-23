package com.pavan.service;

import com.pavan.dao.ICustomerDao;
import com.pavan.dto.CustomerDTO;

public class CustomerServiceMangtImpl implements ICustomerMangtService {

	private ICustomerDao dao = null;
	
	static
	{
		System.out.println("CustomerServieMangtImpl .class file is Loading....");
	}
	public CustomerServiceMangtImpl(ICustomerDao dao) {
		this.dao = dao;
		System.out.println("CustomerMgmtServiceImpl:: 1 param constructor----> " + dao.getClass().getName());
	}








	@Override
	public String caluculateSimpleInterest(CustomerDTO dto) throws Exception {
		return null;
	}

}
