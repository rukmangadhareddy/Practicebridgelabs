package com.bridgelabzs.intrface;

import java.util.Scanner;


public class EvenLocationAverage {

	public static double calculateEvenLocationAverage(int[] array) {
		if(array.length == 0) {
			System.out.println("Array is empty. Cannot calculate average.");
			return -1;
		}
		int sum = 0;
		int count = 0;
		for(int i = 0;i<array.length;i+=2){
			sum += array[i];
			count++;
		}
		return (double)sum/count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array:");
		int size = scan.nextInt();

		int [] numbers = new int[size];
		System.out.println("Enter the elements of the array:");
		
		for (int i= 0;i<size;i++) {
			numbers[i]= scan.nextInt();
		}
		double evenLocationAverage = calculateEvenLocationAverage(numbers);
		
			if(evenLocationAverage != -1){
		
			System.out.println("The Average of the even location is:"+evenLocationAverage);
		}
		scan.close();

	}
}
