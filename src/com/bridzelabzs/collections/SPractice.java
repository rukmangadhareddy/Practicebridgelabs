package com.bridzelabzs.collections;
import java.util.Stack;
public class SPractice {

//	Stack is a class in java in which implements the list interface and extends the 
//	vector class and also represents the LIFo principle
//	push throw th row of the element can be add
//	peek must be used to last element can be show and pop use last element can be removed by the given stack
//	search is used for the top to button can be find and give the final output.
//	push also like do add method only 
//	synchronised vector parent so it is also same as. 
//	Stack ni list and vector 
	public static void main(String[] args) {
		Stack books = new Stack();
		books.push("red book");
		books.push("green book");
		books.push("null");
		books.push("white book");
		books.push("null");
		books.push("white book");
		
//		books .add(0,"yellow books");
		
		
		System.out.println(books.empty());
		System.out.println(books.isEmpty());
//		System.out.println(books.search ("red"));
//		System.out.println(books.search ("green"));
		System.out.println(books);
		
		 
		
        
	}

}
