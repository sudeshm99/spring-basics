package com.udemy.spring.basics.traning.springbasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {
	public int[] sort(int[] numbers){
		// logic for quick sort
		System.out.println("quick sort");
		return numbers;
	}
}
