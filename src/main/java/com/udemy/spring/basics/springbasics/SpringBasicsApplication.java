package com.udemy.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		
		//What are the beans
		//What are the dependencies of the beans
		//Where to search for beans
		
	/*	SortAlgorithom sortAlgo = new QuickSortAlgo();
		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgo);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4}, 4);
		System.out.println(result);*/
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {1,2,3,4}, 4);
		System.out.println(result);
	}
}
