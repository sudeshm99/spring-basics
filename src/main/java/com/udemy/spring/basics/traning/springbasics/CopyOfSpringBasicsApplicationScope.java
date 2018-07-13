package com.udemy.spring.basics.traning.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.udemy.spring.basics.traning.springbasics.basics.*;
import com.udemy.spring.basics.traning.springbasics.scope.PersonDAO;

@SpringBootApplication
public class CopyOfSpringBasicsApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(CopyOfSpringBasicsApplicationScope.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(CopyOfSpringBasicsApplicationScope.class, args);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		//System.out.println("-------------"+personDAO1);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
		
		
	}
}
