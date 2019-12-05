package com.customer.microservice.dto;

import java.util.List;

public class CustomerDTO {
	private  Long  phoneNo;
	private  String  name;
	private  Integer  age;
	private  Long  planId;
	
	private  PlanDetailsDTO  currentPlan;
	private  List<Long>  friends;
	
	
	
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
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
	public PlanDetailsDTO getCurrentPlan() {
		return currentPlan;
	}
	public void setCurrentPlan(PlanDetailsDTO currentPlan) {
		this.currentPlan = currentPlan;
	}
	public List<Long> getFriends() {
		return friends;
	}
	public void setFriends(List<Long> friends) {
		this.friends = friends;
	}
	
	
	

}
