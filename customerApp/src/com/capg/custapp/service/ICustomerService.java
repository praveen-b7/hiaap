package com.capg.custapp.service;

import java.util.List;

import com.capg.custapp.bean.Customer;

public interface ICustomerService {

	
	int addCustomer(Customer c);
	int updateCustomer(Customer c);
	int  deleteCustomerById(int cid);
	Customer getCustomerById(int cid);
	List<Customer> getAllCustomers();
}
