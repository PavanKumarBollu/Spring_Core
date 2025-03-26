package com.pavan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pavan.bo.EmployeeBO;

@Repository(value = "dao")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String INSERT_QUERY = "insert into employee(ename, eaddress, esalary) values(?,?,?)";
	private static final String SELECT_QUERY = "select eid, ename, eaddress, esalary from employee where eid = ?";
	private static final String UPDATE_QUERY = "update employee set ename = ?, eaddress = ?, esalary = ? where eid = ?";
	private static final String DELETE_QUERY = "delete from employee where eid = ?";

	@Autowired
	private DataSource dataSource;

	@Override
	public String saveEmployee(EmployeeBO bo) {
		String result = "";
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pst = connection.prepareStatement(INSERT_QUERY);) {
			if (pst != null) {
				pst.setString(1, bo.geteName());
				pst.setString(2, bo.geteName());
				pst.setInt(3, bo.geteSalary());
				int count = pst.executeUpdate();
				if (count == 0)
					result = "Fail";
				else
					result = "Pass";
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public EmployeeBO getEmployee(Integer eId) {
		EmployeeBO bo = new EmployeeBO();
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pst = connection.prepareStatement(SELECT_QUERY);) {

			pst.setInt(1, eId);
			ResultSet emp = pst.executeQuery();
			if (emp.next()) {

				bo.seteId(emp.getInt("eid"));
				bo.seteName(emp.getString("eName"));
				bo.seteAddress(emp.getString("eAddress"));
				bo.seteSalary(emp.getInt("eSalary"));
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}

	@Override
	public String updateEmployee(EmployeeBO bo) {

		String result = "";
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pst = connection.prepareStatement(UPDATE_QUERY);) {
			if(pst!=null)
			{
				pst.setString(1, bo.geteName());
				pst.setString(2, bo.geteAddress());
				pst.setInt(3, bo.geteSalary());
				pst.setInt(4, bo.geteId());
				
				int count = pst.executeUpdate();
				if (count == 0)
					result = "Fail";
				else
					result = "Pass";
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public String deleteEmployee(Integer eId) {
		String result = "";
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pst = connection.prepareStatement(DELETE_QUERY);) {
			if(pst!= null)
			{
				pst.setInt(1, eId);
				int count = pst.executeUpdate();
				if (count == 0)
					result = "Fail";
				else
					result = "Pass";
			}
			return result;

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [dataSource=" + dataSource + "]";
	}

}
