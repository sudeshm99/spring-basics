package com.udemy.spring.basics.traning.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.spring.basics.traning.aop.business.Business1;
import com.udemy.spring.basics.traning.aop.business.Business2;
import com.udemy.spring.basics.traning.springbasics.SpringBasicsApplicationBasics;
import com.udemy.spring.basics.traning.springbasics.basics.BinarySearchImpl;

@SpringBootApplication
@ComponentScan("com.udemy.spring.basics.traning.aop")
public class SpringBasicsApplicationAop implements CommandLineRunner{
	
	private Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Business1 business1;	
	
	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		//SpringApplication.run(SpringBasicsApplicationAop.class, args);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplicationAop.class);
		Business2 business2 = applicationContext.getBean(Business2.class);		
		System.out.println("---------------------------------");
		System.out.println(business2.businessLogic2());
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info(business1.businessLogic1());
		LOGGER.info(business2.businessLogic2());
	}
	
	
}
