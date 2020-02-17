package com.capg.custapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capg.custapp.bean.Customer;

public class CustomerDAO implements ICustomerDAO {

	Connection conn=DBUtil.getDBConnection();
	@Override
	public int addCustomer(Customer c) {
		int count=0;

try {
	PreparedStatement pst=conn.prepareCall(IQueryMapper.INSERT_CUSTOMER_QUERY);
	pst.setInt(1, c.getCid());
	pst.setString(2, c.getCname());
	pst.setInt(3, c.getAmount());
	pst.setString(4, c.getPdate());
	count = pst.executeUpdate();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		return count;
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

}
