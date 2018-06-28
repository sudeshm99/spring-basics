package com.udemy.spring.basics.traning.springbasics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortAlgo {
	public int[] sort(int[] numbers){
		// logic for bubble sort
		System.out.println("bubble sort");
		return numbers;
	}
}
