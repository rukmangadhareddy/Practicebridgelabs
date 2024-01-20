package com.bridgelabzs.practice;

public class Generics {

	
	public static void toPrint(Integer[] inputArray) {
		for (int element : inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void toPrint(Double[] inputArray) {
		for(double element:inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void toPrint(Character[] inputArray) {
		for(char element : inputArray) {
      System.out.printf("s",element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
Integer[] intArray  = {1,2,3,4,5,};
Double[]doubleArray = {1.1,1.2,1.3,1.4};
Character[] charArray = {'h','e','l','i','o'};

PrintArray.toPrint(intArray);
PrintArray.toPrint(doubleArray);
PrintArray.toPrint(charArray);
	}

}
