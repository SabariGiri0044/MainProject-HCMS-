package com.sabaris.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabaris.demo.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy,Integer>{

}
