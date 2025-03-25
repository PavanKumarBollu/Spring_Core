package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.CustomerBO;
import com.pavan.dao.ICustomerDao;
import com.pavan.dto.CustomerDTO;

@Service(value="service")
public class CustomerServiceMangtImpl implements ICustomerMangtService {

	@Autowired
	private ICustomerDao dao;

	static {
		System.out.println("CustomerServieMangtImpl .class file is Loading....");
	}


	@Override
	public String caluculateSimpleInterest(CustomerDTO dto) throws Exception {

		float intrestAmount = (dto.getPrincipleAmount() * dto.getIntrestRate() * dto.getTime()) / 100.0f;

		CustomerBO bo = new CustomerBO();

		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setPrincipleAmount(dto.getPrincipleAmount());
		bo.setIntrestRate(dto.getIntrestRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrestAmount);

		int count = dao.save(bo);

		return count == 0 ? "Customer Registrationg Failed"
				: "Customer Registration SuccessFull --> principel Amount :: " + intrestAmount;
	}

}
