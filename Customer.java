package com.sabaris.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	private String customername;
	private String customermailid;
	private long phonenumber;
	private long aadhar;
	private String customerpassword;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_policy")
	private Policy policy;
	
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
		
	public Customer() {
		super();
	}
	public Customer(int customerid, String customername, String customermailid, long phonenumber, long aadhar, String customerpassword) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customermailid = customermailid;
		this.phonenumber = phonenumber;
		this.aadhar = aadhar;
		this.customerpassword = customerpassword;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomermailid() {
		return customermailid;
	}
	public void setCustomermailid(String customermailid) {
		this.customermailid = customermailid;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getCustomerpassword() {
		return customerpassword;
	}
	public void setCustomer(String customerpassword) {
		this.customerpassword = customerpassword;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customermailid=" + customermailid + ", phonenumber="
				+ phonenumber + ", aadhar=" + aadhar + ", customerpassword=" + customerpassword +  "]";
	}
	public Object getPolicyid() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPolicyid(Object policyid) {
		// TODO Auto-generated method stub
		
	}
		
}