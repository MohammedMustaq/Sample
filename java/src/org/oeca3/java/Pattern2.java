package org.oeca3.java;

import java.util.Scanner;

public class Pattern2
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr");
		int n=scn.nextInt();
		int num=1;
		int zero=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==3||j==5||j==7)
				{
					System.out.print(num+" ");
				}
				else
					System.out.print(zero+" ");
			}
			System.out.println();
	}
	}
}
