package com.bridgelabzs.simple;
import java.util.Scanner;
public class SumAgain {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number1 , number2;
		char choice;
		do {
			System.out.println("Enter the First Number");
			number1 = console.nextInt();
		
		System.out.println("Enter the Second  Number");
		number2 = console.nextInt();
		int sum = number1+number2;
		System.out.println("Sum of Numbers :"+sum);
			System.out.println("Do you want ot continue y/n");
			choice = console.next().charAt(0);
			System.out.println();
		
		}while(choice=='s'||choice=='S');
				
		}
	}

