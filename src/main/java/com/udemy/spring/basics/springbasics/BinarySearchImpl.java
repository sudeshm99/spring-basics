package com.udemy.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithom sortAlgo;
	
	public BinarySearchImpl(SortAlgorithom sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}

	/*public BinarySearchImpl(SortAlgorithom sortAlgo) {
		this.sortAlgo = sortAlgo;
	}*/
	public int binarySearch(int[] numbers, int value){
		int[] sortedNumbers = sortAlgo.sort(numbers); 
		System.out.println(sortAlgo);
		// sort using quick sort algo;
		// implementing search logic using sortNumbers
		return 3;
	}
}
