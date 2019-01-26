package org.oeca3.java;

import java.util.Scanner;

public class Prim 
{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		int n=scn.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		}
}
