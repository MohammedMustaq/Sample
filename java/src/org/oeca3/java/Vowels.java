package org.oeca3.java;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.next();
		String s1="";
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				s1=s1+c[i];
				
		}
System.out.println(s1);
	}

}
