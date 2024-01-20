package com.bridgelabzs.sorting;

import java.util.Arrays;

public class SortingExample {

	public static void main(String[] args) {
		int [] numbers = {5,6,8,3,2,1};
		System.out.println("Original Array :"+Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Sorted Arrays:"+Arrays.toString(numbers));

	}

}

