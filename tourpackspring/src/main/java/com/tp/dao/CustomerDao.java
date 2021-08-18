package com.tp.dao;

import java.util.List;

import com.tp.entity.Customer;

public interface CustomerDao {
	
	public void createCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer getCustomer(Customer customer);
	public List<Customer> updateCustomer(Customer customer);
	public List<Customer> deleteCustomer(int cno);
	
	public Customer getCustomerById(int cid);

}
