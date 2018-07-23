package com.udemy.spring.basics.traning.springbasics.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCdi {
	
	@Autowired
	BusinessCdiDao businessCdiDao;

	public BusinessCdiDao getBusinessCdiDao() {
		return businessCdiDao;
	}

	public void setBusinessCdiDao(BusinessCdiDao businessCdiDao) {
		this.businessCdiDao = businessCdiDao;
	}
		
}
