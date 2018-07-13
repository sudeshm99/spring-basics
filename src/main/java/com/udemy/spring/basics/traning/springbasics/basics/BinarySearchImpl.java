package com.udemy.spring.basics.traning.springbasics.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgo bubblcSortAlgo;
		
	
/*	public BinarySearchImpl(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}*/
/*
	public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
*/

		public int binarySearch(int numberArr[], int number){
		int index=number+10; 
		System.out.println("binary search");
		System.out.println(bubblcSortAlgo);
		int[] sortedArr = bubblcSortAlgo.sort(numberArr);
		// search the array using sorted arr
		return index;
	}
	
}
