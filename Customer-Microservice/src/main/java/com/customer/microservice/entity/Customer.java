package com.customer.microservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer {
	@Id
	@Column(name="phone_no")
	private  Long   phoneNo;
	
	@Column(name="name")
	private  String  name;
	
	@Column(name="password")
	private   String   password;
	
	@Column(name="age")
	private  Integer  age;
	
	@Column(name="plan_id")
	private  Long  planId;

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

}
