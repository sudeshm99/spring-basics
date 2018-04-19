package com.udemy.spring.basics.springbasics;

public class BinarySearchImpl {
	private SortAlgorithom sortAlgo;
	public BinarySearchImpl(SortAlgorithom sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	public int binarySearch(int[] numbers, int value){
		int[] sortedNumbers = sortAlgo.sort(numbers); 
		System.out.println(sortAlgo);
		// sort using quick sort algo;
		// implementing search logic using sortNumbers
		return 3;
	}
}
