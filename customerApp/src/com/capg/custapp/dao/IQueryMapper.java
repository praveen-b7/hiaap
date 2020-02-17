package com.capg.custapp.dao;

public interface IQueryMapper {

	String INSERT_CUSTOMER_QUERY = "insert into customer values (?,?,?,TO_DATE(?,'dd-mm-yy'))";
}
