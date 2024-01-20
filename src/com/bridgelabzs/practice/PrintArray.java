package com.bridgelabzs.practice;

public class  PrintArray {

	public static <T> void toPrint(T[] inputArray) {
		for (T  element : inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	
	public static  void main(String[] args) {
		
		Integer[] intArray  = {1,2,3,4,5,};
		Double[]doubleArray = {1.1,1.2,1.3,1.4};
		Character[] charArray = {'h','e','l','i','o'};

		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
		
	}

}
