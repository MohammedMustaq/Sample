package org.oeca3.java;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.next();
		String s1="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=65 && c[i]<=90)
				c[i]=(char) (c[i]+32);
			else 
				c[i]=(char) (c[i]-32);
			s1+=c[i];
		}
	    System.out.println(s1);
	    
	   
	

	}

}
