package com.udemy.spring.basics.traning.springbasics.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
		
		private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
		
		public int binarySearch(int numberArr[], int number){
		int index=number+10; 
		System.out.println("binary search");
		System.out.println(bubblcSortAlgo);
		int[] sortedArr = bubblcSortAlgo.sort(numberArr);
		// search the array using sorted arr
		return index;
		}
		
		@PostConstruct
		public void postConstruct(){
			LOGGER.info("---------------------- POST construct ---------------------");
		}
		
		@PreDestroy
		public void pryDistroy(){
			LOGGER.info("---------------------- Pre Destroy ---------------------");
		}
	
}
