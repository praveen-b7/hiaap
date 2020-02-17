package com.capg.custapp.dao;

import java.util.List;

import com.capg.custapp.bean.Customer;

public interface ICustomerDAO {
	

	int addCustomer(Customer c);
	int updateCustomer(Customer c);
	int  deleteCustomerById(int cid);
	Customer getCustomerById(int cid);
	List<Customer> getAllCustomers();

}
