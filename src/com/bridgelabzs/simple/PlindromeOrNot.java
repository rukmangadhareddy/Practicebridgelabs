package com.bridgelabzs.simple;
import java. util.Scanner;
public class PlindromeOrNot {
	
	public static void main(String[] args) {
		System.out.println("Enter a number:" );

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int num1 = number;
	int remainder;
	int sum = 0;
	
		while(number>0) {
		remainder= number%10;
		sum = sum*10+remainder;
		num1= number/10;
	}
	if (sum==num1) {
		System.out.println("is Palindrome");
	}else{System.out.println("is not palindrome");
		
}		  
		
}
}




		
//		if(isPalindrome(int num)) {
//			System.out.println("is palindrome"+num);
//		}else { System.out.println("is not a Palindrome"+ num);
//		}
//		
//		
//		public static void boolean isPalindrome(int num) {
//			String intStr = Integer.toString(num);
//			Object numStr;
//			for (int start= 0 ,end = numStr.length() - 1;start<end;start++,end--) {
//				
//				if(numStr.charAt(start)!= numStr.charAt(end)) {
//					return false;
//					
//				}
//			}
//			return true;
//		}
//}
//
