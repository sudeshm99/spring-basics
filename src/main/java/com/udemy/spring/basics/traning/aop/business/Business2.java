package com.udemy.spring.basics.traning.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.spring.basics.traning.aop.data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String businessLogic2(){
		return "business 2 and "+dao2.retrieveData();
	}
}
