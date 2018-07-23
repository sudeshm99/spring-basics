package com.udemy.spring.basics.traning.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.spring.basics.traning.springbasics.basics.*;
import com.udemy.spring.basics.traning.springbasics.xml.XmlPersonDAO;

public class SpringBasicsApplicationXmlContext {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplicationXmlContext.class);
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		LOGGER.info("-------------------------- {} ", personDao);
		LOGGER.info("-------------------------- {} ", personDao.getXmlJdbcConnection());
		LOGGER.info("application context: -> {} ",(Object)applicationContext.getBeanDefinitionNames());

		applicationContext.close();
	}
}
