package com.bridgelabzs.intrface;
import java.util.*;
public class DuplicateNumbers {
public static void main(String[] args) {
	

//	int  number = 0;
	int [] arr = new int []  {32,3,4,5,6,7,8};
    List<Integer> numbers = new ArrayList<>();
	numbers.add(3);
	numbers.add(5);
	numbers.add(6);
	numbers.add(9);
	numbers.add(8);
	numbers.add(0);
	
	Collections.sort(numbers);
	System.out.println(numbers);
//	int Arrays.sort();
	for (int i=0;i<numbers.size();i++) {
//	System.out.println(numbers [i]+" ");
	System.out.println("list of array :" +numbers);
	}	
	
	
//	for (int i =numbers.size()-1;1>=0;i--) {
//		System.out.println(numbers+ " ");
		System.out.println("reverse of array:"+ numbers );
}
}



