package com.bridgelabzs.Exception;

public class Main {

	public static void main(String[] args) {
		
		Vote vote = new Vote();
		try {
			vote.putVote(5);
			
		}
		catch (VoterException e) {
			System.out.println("Invalid Age");
		}
	}
		}
		
		
		
		
		
		
		
//	int num1 =5;
//	int num2 = 0;
//	int sum = num1/num2;
//	System.out.println("sum");
//	}
//
//}
