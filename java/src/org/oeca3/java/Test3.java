package org.oeca3.java;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		s=s.toLowerCase();
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{             
			char c=s.charAt(i);
             if (Character.isDigit(c))
                 s1 = s1+c;
			
		}
		 System.out.println(s1);

	}

}
