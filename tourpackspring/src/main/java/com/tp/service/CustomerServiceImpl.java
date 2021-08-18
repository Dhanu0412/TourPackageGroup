package com.tp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tp.dao.CustomerDao;
import com.tp.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer getCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(customer);
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	@Override
	public List<Customer> deleteCustomer(int cno) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(cno);
	}

	@Override
	public List<Customer> getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerById(cid);
	}

}