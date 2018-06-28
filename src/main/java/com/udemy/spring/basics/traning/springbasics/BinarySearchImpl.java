package com.udemy.spring.basics.traning.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgo sortAlgo;
		
	public BinarySearchImpl(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}

	public int binarySearch(int numberArr[], int number){
		int index=number;
		System.out.println("binary search");
		int[] sortedArr = sortAlgo.sort(numberArr);
		// search the array using sorted arr
		return index;
	}
	
}
