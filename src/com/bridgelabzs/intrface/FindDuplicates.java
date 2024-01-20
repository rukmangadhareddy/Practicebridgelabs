package com.bridgelabzs.intrface;

import java.util.*;

public class FindDuplicates {
public static void findDuplicates(int[]arrray) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		int[] array = null;
		for (int num: array) {
			if(!set.add(num)) {
				duplicates.add(num);
			}
		}
		
		System.out.println("Duplicates numbers in the array:" +duplicates);
	}
public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5,6,2,2,5,7,8,9,0,1};
	findDuplicates(numbers);
	
			}
		
	}


