package com.bridzelabzs.collections;
import java.util.Vector;
public class VPractice {
//vector
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("yadagiri");
		Vector v2 = new Vector();
		v2.add("charan");
		v1.add(v2);
		
		System.out.println(v2);
		
		
		v1.add(0,"roohit");
		System.out.println(v1);
		
}
}


