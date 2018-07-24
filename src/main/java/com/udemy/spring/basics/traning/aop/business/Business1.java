package com.udemy.spring.basics.traning.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.spring.basics.traning.aop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	public String businessLogic1(){
		return "business 1 and "+dao1.retrieveData();
	}
}
