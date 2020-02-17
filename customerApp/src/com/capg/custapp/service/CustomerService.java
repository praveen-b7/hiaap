package com.capg.custapp.service;

import java.util.List;

import com.capg.custapp.bean.Customer;
import com.capg.custapp.dao.CustomerDAO;
import com.capg.custapp.dao.ICustomerDAO;

public class CustomerService implements ICustomerService {

	ICustomerDAO dao=new CustomerDAO();
	
	@Override
	public int addCustomer(Customer c) {
		
		


		return dao.addCustomer(c);
	}

	@Override
	public int updateCustomer(Customer c) {


		return 0;
	}

	@Override
	public int deleteCustomerById(int cid) {


		return 0;
	}

	@Override
	public Customer getCustomerById(int cid) {


		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {


		return null;
	}

	public static boolean isValidCid(int cid)
	{
		boolean flag=false;
	
		if(cid!=0 && (cid>99 && cid<1000))
		{
			flag=true;
		}
		
		return flag;
	}
	public static boolean isValidCname(String cname)
	{
		boolean flag=false;
		if(cname.length()>=4);
		{
			flag=true;
		}
		
		return flag;
	}
		
	public static boolean userValidation(Customer c)
	{
		boolean flag=false;
		if(isValidCid(c.getCid()) && isValidCname(c.getCname()))
		{
			flag=true;
		}
	return flag;
		
}
}
