package com.udemy.spring.basics.traning.springbasics.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	public JdbcConnection(){
		System.out.println("JDBC Connection");
	}
}
