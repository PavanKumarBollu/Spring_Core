package com.pavan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pavan.bo.CustomerBO;

public class CustomerMySQLDAOImple implements ICustomerDao {

	
	
	
	private static final String INSERT_QUERY = "insert into customer (cName, caddress, pamt, rate, time,intrAmt )values(?,?,?,?,?,?)";
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
		int count = 0;
		try(Connection connection = dataSource.getConnection();
				PreparedStatement pst = connection.prepareStatement(INSERT_QUERY))
		{
			pst.setString(1, bo.getCustomerName());
			pst.setString(2, bo.getCustomerAddress());
			pst.setFloat(3, bo.getPrincipleAmount());
			pst.setFloat(4, bo.getIntrestRate());
			pst.setFloat(5, bo.getTime());
			pst.setFloat(6, bo.getIntrestAmount());
			
			count = pst.executeUpdate();
			
			
			
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}

}
