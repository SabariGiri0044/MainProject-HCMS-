package com.sabaris.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sabaris.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	

}