package org.oeca3.java;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.next();
		System.out.println("enter a char to search");
		String c=scn.next();
		int n=s1.length()-s1.replace(c, "").length();
		
		System.out.println(n);
	
		
	}
	


}
