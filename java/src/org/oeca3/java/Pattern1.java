package org.oeca3.java;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr");
		int n=scn.nextInt();
		int spaces=25;
		int num=1;
		int i;
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=num;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			num+=1;
			spaces++;
			
		}
	
num=n-1;
spaces-=2;
			for(int l=1;l<=n-1;l++)
			{
				for(int j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				for(int k=num;k<=n;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println();
				spaces--;
				num-=1;
				
			
		}

	

}
}
