package com.bridgelabzs.practice;

public class MyDemo {
	public static void main(String[]args) {
		
		MyMathUtil<Integer> intMathUtil = new MyMathUtil<Integer>();
		System.out.println(intMathUtil.isEquals(1,1));
	
		
		MyMathUtil<Double> doubleMathUtil = new MyMathUtil<Double>();
		System.out.println(doubleMathUtil.isEquals(1.7,1.5));
		
//		MyMathUtil<String> stringMathUtil = new MyMathUtil<String>();
//		System.out.println(stringMathutil.isEquals(" hello","How are u"));
	}

}
