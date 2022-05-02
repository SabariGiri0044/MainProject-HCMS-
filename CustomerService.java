package com.sabaris.demo.service;

import java.util.List;

import com.sabaris.demo.entity.Customer;

public interface CustomerService {


	Customer savecust(Customer customer);

	List<Customer> fetchCustomer();

	Customer fetchCustomerById(int custid);

	Customer updateCustomer(int custid, Customer customer);

	void deleteCustomerById(int custid);

		
}
