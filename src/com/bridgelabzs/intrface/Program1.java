package com.bridgelabzs.intrface;
import java.util.*;

public class Program1 {
public static void main(String[] args) {
LinkedList<Integer> list= new LinkedList<>();
list.add(4);
list.add(5);
list.add(0);
list.add(9);
list.add(8);
list.add(10);
list.add(9);
list.add(6);
System.out.println("input:"+list);
int sum = 0;

for (int i=0;i<list.size();i++)
{
	sum+=list.get(i);
}
System.out.println("sum:"+sum);
System.out.println("Average."+sum/list.size());
}	
}
	

