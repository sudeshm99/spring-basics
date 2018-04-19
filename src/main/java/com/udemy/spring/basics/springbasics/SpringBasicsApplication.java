package com.udemy.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		
		SortAlgorithom sortAlgo = new QuickSortAlgo();
		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgo);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4}, 4);
		System.out.println(result);
		//SpringApplication.run(SpringBasicsApplication.class, args);
		
	}
}
