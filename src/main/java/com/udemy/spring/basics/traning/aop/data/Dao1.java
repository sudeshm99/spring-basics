package com.udemy.spring.basics.traning.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String retrieveData(){
		return "Dao1";
	}
}
