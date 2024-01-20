package com.bridgelabzs.simple;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner input = new Scanner(System.in);
		int num1 = input .nextInt();
		int sum  = 0;
		int i;
		for (i=0;i<=num1;i++);
		if (num1%i==0) {
			sum++;
		}
	
	if( sum==2)
	System.out.println("Is Prime");
	else
		System.out.println(" Is not Prime");

		}
	}
 

 

