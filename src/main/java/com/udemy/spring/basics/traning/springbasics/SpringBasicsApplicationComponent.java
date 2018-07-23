package com.udemy.spring.basics.traning.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.udemy.spring.basics.traning.componetns.ComponentDAO;
import com.udemy.spring.basics.traning.springbasics.basics.*;
import com.udemy.spring.basics.traning.springbasics.scope.PersonDAO;

@SpringBootApplication
//@ComponentScan("com.udemy.spring.basics.traning.springbasics")
@ComponentScan("com.udemy.spring.basics.traning.componetns")
public class SpringBasicsApplicationComponent {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplicationComponent.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplicationComponent.class, args);
		ComponentDAO compDAO1 = applicationContext.getBean(ComponentDAO.class);
		//System.out.println("-------------"+personDAO1);
		//ComponentDAO compDAO2 = applicationContext.getBean(ComponentDAO.class);
		
		System.out.println("---------------------------------------");
		LOGGER.info("{}", compDAO1);
		System.out.println("---------------------------------------");
		
	}
}
