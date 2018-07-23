package com.udemy.spring.basics.traning.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.spring.basics.traning.springbasics.basics.*;

@Configuration
@ComponentScan("com.udemy.spring.basics.traning.springbasics.basics")
public class SpringBasicsApplicationBasics {

	public static void main(String[] args) {
		//SortAlgo sortAlgo = new QuickSortAlgo();
		//BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgo);
		//int result = binarySearch.binarySearch(new int[] {12,3,11,21}, 3);
		//System.out.println("result: "+result);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplicationBasics.class);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("-------------"+binarySearchImpl);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("-----------"+binarySearchImpl2);
		
		int result = binarySearchImpl.binarySearch(new int[] {1,2,3,4}, 4);
//		System.out.println(result);
		applicationContext.close();
	}
}
