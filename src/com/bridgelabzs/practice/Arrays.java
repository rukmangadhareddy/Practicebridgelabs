package com.bridgelabzs.practice;
import java.util.*;
public class Arrays {
		public static void main(String[] args) {
			System.out.println("Enter the size of the array:");
			Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			
             int []numbers = new int [size];
             System.out.println("Enter the elements of the array");
			
             for (int i = 0;i<size;i++) { 
				numbers[i]= scan.nextInt();

			}
			System.out.println();
			System.out.println("Array increase order");
			for(int i = size-1;1>=0;i--) {
				System.out.println(numbers[i]+ " ");
				scan.close();
			}
		}
	}
	

//	public static int reverseArrayList(int[] array) {
//		if(arr.length<2) {
//			System.out.println("array should have atleast two elements");
//			return -1;

//	System.out.println("Original array");
//	write the scanner class using also covert the reverse an 
//	array of numbers only for two for loops,
//		}