package com.pavan.dao;

import javax.sql.DataSource;

import com.pavan.test.CustomerBO;

public class CustomerMySQLDAOImple implements ICustomerDao {

	
	private DataSource dataSource = null;
	
	static
	{
		System.out.println("CustomerMySQLDAOImple .class file is loading....\n");
	}
		public CustomerMySQLDAOImple(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("CustomerMySQLDAOImpl:: 1 param constructor -----> " + dataSource.getClass().getName());
	}

	@Override
	public int save(CustomerBO bo) throws Exception {
		return 0;
	}

}
