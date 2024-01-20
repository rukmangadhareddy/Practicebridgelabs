package com.bridgelabzs.sorting;

public class EvenIndex {

	public static void main(String[] args) {

int[] arrayNumber = {1,2,3,4,5,6,7,8,9};
int dividend = 0;
int divisor = 0;

for(int i=1;i<arrayNumber.length;i++) {
	if(i%2==0){ 
		dividend = dividend+arrayNumber[i];
		divisor++;
		System.out.print(arrayNumber[i]+",");  
		
		}  
}
int average= dividend/divisor;
int evenIndex = dividend+1;
System.out.println("\nAddition of even Number	     : "+ dividend);
System.out.println("Total Number of Even Number  : "+divisor);
System.out.println("Average of Even No. in Array : "+average);
System.out.println("even in`dex to the array:"+ evenIndex);
}
}
