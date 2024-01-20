package com.bridgelabzs.intrface;

import java.util.Scanner;

public class FactorialNumber {
	public static int findSecondLargestNumber(int []array) {
		if(array.length<2) {
			System.out.println("Array should have at least two elemnts");
			return -1;
			
		}
		int firstMax = Integer.MIN_VALUE;
		int secondMax= Integer.MIN_VALUE;
		
		for(int num:array) {
			if (num>firstMax) {
				secondMax=num;
			}else if (num>secondMax && num<firstMax) {
				secondMax = num;
			}
		}
			return secondMax;	
		
		
	} 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		
		int[] numbers = new int [size];
	System.out.println("Enter the elements of the array:");
	for (int i = 0; i <size; i++) {
		numbers[i] = scan.nextInt();
		
	}
	int secondLargest = findSecondLargestNumber(numbers);
	if(secondLargest !=-1) {
		System.out.println("The second largest number is: "+secondLargest);
	}
	scan.close();
	
	}
	

}
