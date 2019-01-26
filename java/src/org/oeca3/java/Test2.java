package org.oeca3.java;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	System.out.println("enter a string");
		String s1=scn.nextLine();
		String[] a=s1.split(" ");
		String s2="";
		for(int i=a.length-1;i>=0;i--)
		{
			s2=s2+" "+a[i];
		}
		
		System.out.println(s2);

	}

}
