package com.capg.custapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.custapp.bean.Customer;
import com.capg.custapp.service.CustomerService;
import com.capg.custapp.service.ICustomerService;

class CustomerServiceTest {

	static ICustomerService object;

	@BeforeAll
	public static void getObject() // must be declared as static because it must be executed before all
	{
		object = new CustomerService();
	}

	@Test
	void testAddCustomer() {

		Customer obj = new Customer();
		obj.setCid(923);
		obj.setAmount(99008);
		obj.setCname("ranjith");
		obj.setPdate("20-12-20");
		
		int record= object.addCustomer(obj);
		assertEquals(1,record);

	}

	@Test
	void testIsValidCid() {
	
	}

	@Test
	void testIsValidCname() {
		
	}

	@Test
	void testUserValidation() {
		
	}

}
