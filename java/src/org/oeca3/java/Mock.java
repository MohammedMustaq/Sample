package org.oeca3.java;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Mock 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.nextLine();
		int count=0;
		String s2="";
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=48 && c[i]<=57)
				s2=s2+c[i];
		}
		System.out.println(s2);
		
		
		
		
	}



	

}
