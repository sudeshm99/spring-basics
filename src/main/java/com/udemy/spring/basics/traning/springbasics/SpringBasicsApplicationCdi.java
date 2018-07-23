package com.udemy.spring.basics.traning.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.udemy.spring.basics.traning.springbasics.cdi.BusinessCdi;

@SpringBootApplication
//@ComponentScan("com.udemy.spring.basics.traning.springbasics")
@ComponentScan("com.udemy.spring.basics.traning.springbasics.cdi")
public class SpringBasicsApplicationCdi {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplicationCdi.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplicationCdi.class, args);
		BusinessCdi businessCdi = applicationContext.getBean(BusinessCdi.class);
		//System.out.println("-------------"+personDAO1);
		//ComponentDAO compDAO2 = applicationContext.getBean(ComponentDAO.class);
		
		System.out.println("---------------------------------------");
		LOGGER.info("{} some dao ==== {}", businessCdi,businessCdi.getBusinessCdiDao());
		System.out.println("---------------------------------------");
		
	}
}
