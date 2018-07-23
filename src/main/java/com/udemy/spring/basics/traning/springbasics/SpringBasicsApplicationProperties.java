package com.udemy.spring.basics.traning.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.udemy.spring.basics.traning.springbasics.basics.*;
import com.udemy.spring.basics.traning.springbasics.properties.SomeExternalProperties;

@Configuration
@ComponentScan("com.udemy.spring.basics.traning.springbasics.properties")
@PropertySource("classpath:app.properties")
public class SpringBasicsApplicationProperties {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplicationProperties.class);
		SomeExternalProperties someExternalProperties = applicationContext.getBean(SomeExternalProperties.class);
		System.out.println("-------------"+someExternalProperties);
		System.out.println("-------------"+someExternalProperties.returnServiceUrl());
		applicationContext.close();
	}
}
