package com.sabaris.demo.service;

import java.util.List;

import com.sabaris.demo.entity.Policy;

public interface PolicyService {

	Policy savepolicy(Policy poly);


	Policy fetchPolicyById(int policyid);

	Policy updatePolicy(int policyid, Policy policy);

	void deleteByPolicyById(int policyid);


	List<Policy> fetchPolicy();

}
