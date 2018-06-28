package com.udemy.spring.basics.traning.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		SortAlgo sortAlgo = new QuickSortAlgo();
		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgo);
		int result = binarySearch.binarySearch(new int[] {12,3,11,21}, 3);
		System.out.println("result: "+result);
		//SpringApplication.run(SpringBasicsApplication.class, args);
	}
}
