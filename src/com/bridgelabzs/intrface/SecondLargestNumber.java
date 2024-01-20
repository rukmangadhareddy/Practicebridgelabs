package com.bridgelabzs.intrface;
import java .util.*;
public class SecondLargestNumber {
	public static int findSecondLargest(int[] array) {
		if(array.length<2) {
			System.out.println("array should have at least two elements.");
			return-1;
		}
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num:array) {
			if(num>firstMax) {
				secondMax = firstMax;
				firstMax = num;
			}else if (num>secondMax && num<firstMax) {
				secondMax = num;

			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of the number:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter the elements of the array:");
		
		for(int i=0;i<size;i++) {
			numbers[i] = scan.nextShort();
			
		}
		
		int secondLargest = findSecondLargest(numbers);

		if(secondLargest != -1) {
			System.out.println("The second largestnumberis:"+secondLargest );
		}
		scan.close();
	}
}


