package com.bridgelabzs.sorting;

public class SelectionSort {

	public static void main(String[] args) {
			
			int[] numbers = {5,6,7,9,3,2,1};
			System.out.println("original Array:" +arrayToString(numbers));
			selectionSort(numbers);
			System.out.println("Sorted Array:" +arrayToString(numbers));
			}

			private static void selectionSort(int[] arr) {
				int n = arr.length;
				for(int i =0;i<n-1;i++);{
					int minIndex = i;
					for (int j= i+1; j<n;j++) {
					if (arr[j]<arr[minIndex]){
						minIndex =j;
					}
				}
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex]=temp;
			}
		}
			private static  String arrayToString(int[]arr) {
				StringBuilder result = new StringBuilder("[");
				for (int i= 0; i<arr.length;i++) {
					result.append(arr[i]);
					if(i< arr.length - 1) {
						result.append(" ,");
				}
				}
			result.append ("]");
			return result.toString();
			}

	}


