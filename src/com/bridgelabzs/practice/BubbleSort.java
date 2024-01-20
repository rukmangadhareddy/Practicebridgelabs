package com.bridgelabzs.practice;
import java.util.*;
import java.util.Arrays;
public class BubbleSort {

public static void main(String[] args) {
	int[] numbers = {65,76,46,87,67,21};
	bubbleSort(numbers);
//	System.out.println("Sorted array using Bubble sort:"+Arrays.toString());
BubbleSort sort = new BubbleSort();

	System.out.println(sort.toString());
}
static void bubbleSort(int[] arr) {
	int n = arr.length;
	for(int i=0;i<n-1;i++) {
	for(int j=0;j<n-i-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j] = arr[j+i];
			arr[j+1]= temp;
			
		}
	}
}
}
}


	