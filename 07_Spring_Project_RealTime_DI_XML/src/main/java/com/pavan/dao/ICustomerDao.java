package com.pavan.dao;

import com.pavan.test.CustomerBO;

public interface ICustomerDao {
	public int save(CustomerBO bo) throws Exception;
}
