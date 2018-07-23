package com.udemy.spring.basics.traning.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.spring.basics.traning.springbasics.basics.*;
import com.udemy.spring.basics.traning.springbasics.scope.PersonDAO;

@Configuration
@ComponentScan("com.udemy.spring.basics.traning.springbasics.scope")
public class SpringBasicsApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplicationScope.class);
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplicationScope.class);
				//SpringApplication.run(SpringBasicsApplicationScope.class, args);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		//System.out.println("-------------"+personDAO1);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		System.out.println("---------------------------------------");
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
		System.out.println("---------------------------------------");
		applicationContext.close();
	}
}
