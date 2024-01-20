package com.bridgelabzs.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int []array = {7,5,9,3,6};
		System.out.println("Original Array:");
		printArray(array);
		bubbleSort(array);
		System.out.println("n/Sorted Array:");
		printArray(array);
	}
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1;i++) {
				for (int j=0;j<n-i-1;j++) {
					if (arr[j]>arr[j+1]) {
						
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]=temp;
					}
					}
				}
			}
	
private static void printArray(int[]arr) {
	for (int value:arr) {
		System.out.println(value+" ");
	}
	System.out.println();
}
}
//		private static String arrayToString(int[] arr) {
//			StringBuilder result  = new StringBuilder("[");
//			for(int i=0; i<arr.length;i++) {
//				result.append(arr[i]);
//				if(i<arr.length-1) {
//				result.append(",");
//			}
//			
//		}
//		result.append("]");
//		return result.toString();
//		
			
		
	
	


