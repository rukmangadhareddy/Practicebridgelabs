package com.bridgelabzs.Exception;

public class Vote {
	
public void putVote(int age) throws VoterException {
	if(age<=18) {
		System.out.println("you can vote");
	}
	else 
		throw new VoterException();

}
}
