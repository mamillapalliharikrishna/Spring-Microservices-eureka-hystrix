package com.customer.microservice.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.microservice.dto.CustomerDTO;
import com.customer.microservice.dto.Login;
import com.customer.microservice.entity.Customer;
import com.customer.microservice.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private  CustomerRepository  repo;
	
	public  String  saveCustomer(Customer  customer) {
		repo.saveAndFlush(customer);
		return  "customer is registered successfully";
	}
	
	public   boolean     checkLogin(Login  login) {
		if(repo.existsById(login.getPhoneNo())) {
			Optional<Customer>   opt=repo.findById(login.getPhoneNo());
			Customer  customer=opt.get();
			if(customer.getPassword().equals(login.getPassword())) {
				return  true;
			}
			else {
				return  false;
			}
		}
		else {
			return  false;
		}
	}
	
	public  CustomerDTO   getCustomerByPhoneNo(Long  phoneNo) {
		Optional<Customer>  opt = repo.findById(phoneNo);
		Customer  customer =opt.get();
		CustomerDTO  dto =new  CustomerDTO();
		/*dto.setPhoneNo(customer.getPhoneNo());
		dto.setName(customer.getName());
		dto.setAge(customer.getAge());
		dto.setPlanId(customer.getPlanId());*/
		BeanUtils.copyProperties(customer, dto);
		return dto;
	}
}
