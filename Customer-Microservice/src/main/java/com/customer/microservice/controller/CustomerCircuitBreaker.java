package com.customer.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@Service

public class CustomerCircuitBreaker {
	String    FRIEND_URL="http://FRIEND/FriendMicroservice/friends/{phoneNo}";
	@Autowired
	RestTemplate   restTemplate;
	
	@HystrixCommand(fallbackMethod="getFriendsCallback")
	public   List<Long>   getFriends(Long  phoneNo) {
		System.out.println("getFriends()");
		ResponseEntity<List<Long>>    friends=restTemplate.exchange(FRIEND_URL, HttpMethod.GET,null,new ParameterizedTypeReference<List<Long>>() { }, phoneNo);
		List<Long>  friendsList=friends.getBody();
		return  friendsList;
		
	}
	
	public   List<Long>    getFriendsCallback(Long  phoneNo) {
		System.out.println("getFriendsCallback()");
		return   new   ArrayList<Long>();
	}

}
