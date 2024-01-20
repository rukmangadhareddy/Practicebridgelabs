package com.bridgelabzs.practice;

public class LinkedListpalindrome {

	public static void main(String[] args) {
		int[] arr = {2,3,6,4,9,7,5,8,6,3,1};
		for(int i= 0;i<arr.length/2;i++) {
		for(int j=i+1;j<arr.length/2;j++) {
		if(arr[i]>arr[j]) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}
for(int i= arr.length/2;i<arr.length;i++) {
for(int j=i+1; j<arr.length;j++) {
	if(arr[i]<arr[j]) {
		int temp = arr[j];
		arr[i]= arr[j];
		arr[j]=temp;
	}
}
}
for(int i= 0;i<arr.length;i++) {
System.out.println(" "+arr[i]);	
	}
	}
}

