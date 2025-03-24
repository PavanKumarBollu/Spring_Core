package com.pavan.dao;

import com.pavan.bo.CustomerBO;

public interface ICustomerDao {
	public int save(CustomerBO bo) throws Exception;
}
