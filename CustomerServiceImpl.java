package com.sabaris.demo.service;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabaris.demo.entity.Customer;
import com.sabaris.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	

		@Autowired
		CustomerRepository customerrepo;

		@Override
		public Customer savecust(Customer customer) {
			return customerrepo.save(customer);
		}

		@Override
		public List<Customer> fetchCustomer() {
			return customerrepo.findAll();
		}

		//get by id
		@Override
		public Customer fetchCustomerById(int customerid) {
			return customerrepo.findById(customerid).get();
		}

		//put method
		@Override
		public Customer updateCustomer(int customerid, Customer customer) {
			Customer updatecustomerdb = customerrepo.findById(customerid).get();
			if(Objects.nonNull(customer.getCustomername())&&!"".equalsIgnoreCase(customer.getCustomername())) {
				updatecustomerdb.setCustomername(customer.getCustomername());
			}
			if(Objects.nonNull(customer.getCustomermailid())&&!"".equalsIgnoreCase(customer.getCustomermailid())) {
				updatecustomerdb.setCustomermailid(customer.getCustomermailid());
			}
			if(Objects.nonNull(customer.getPhonenumber())) {
				updatecustomerdb.setPhonenumber(customer.getPhonenumber());
			}
			if(Objects.nonNull(customer.getAadhar())) {
				updatecustomerdb.setAadhar(customer.getAadhar());
			}
			if(Objects.nonNull(customer.getCustomerpassword())&&!"".equals(customer.getCustomerpassword())) {
				updatecustomerdb.setCustomer(customer.getCustomerpassword());
			}
			return customerrepo.save(updatecustomerdb);
		}
		
		
		@Override
		public void deleteCustomerById(int customerid) {
				customerrepo.deleteById(customerid);
		}


	}
