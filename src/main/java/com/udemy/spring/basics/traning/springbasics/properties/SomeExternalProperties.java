package com.udemy.spring.basics.traning.springbasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalProperties {
	// get from property file
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceUrl(){
		return url;
	}
}
