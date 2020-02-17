package com.capg.custapp.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.custapp.bean.Customer;
import com.capg.custapp.service.CustomerService;
import com.capg.custapp.service.ICustomerService;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Customer customerobject = new Customer();
		ICustomerService serv = new CustomerService();
		while (true) {

			System.out.println("      CUSTOMER SERVICE APPLICATION   ");
			System.out.println("1. add customer details");
			System.out.println("2. update customer details");
			System.out.println("3. get  one customer details");
			System.out.println("4. get all customerS details");
			System.out.println("5. delete customer details");
			System.out.println("6. exit");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter customer NAME");
				String cname = scan.next();
				System.out.println("Enter customer ID");
				int cid = scan.nextInt();
				System.out.println("Enter customer AMOUNT");
				int amount = scan.nextInt();
				System.out.println("Enter date of purchase");
				String pdate = scan.next();
				customerobject.setAmount(amount);
				customerobject.setCid(cid);
				customerobject.setCname(cname);
				customerobject.setPdate(pdate);
				boolean isValid = CustomerService.userValidation(customerobject);
				if (isValid) {
					int count = serv.addCustomer(customerobject);
					System.out.println(count + " inserted");
				}
				else
				{
					System.out.println("Enter valid data");
				}

				break;
			case 2:
				serv.updateCustomer(customerobject);

				break;

			case 3:
				serv.getCustomerById(customerobject.getCid());

				break;

			case 4:
				List<Customer> customerlist = serv.getAllCustomers();

				break;

			case 5:

				break;

			case 6:

				System.exit(0);
				break;

			default:
				System.out.println("BETTER PROVIDE VALID CHOICE");
				break;
			}

		}

	}

}
