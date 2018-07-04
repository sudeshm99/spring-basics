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
		int index=number+10;
		System.out.println("binary search");
		System.out.println(sortAlgo);
		int[] sortedArr = sortAlgo.sort(numberArr);
		// search the array using sorted arr
		return index;
	}
	
}
