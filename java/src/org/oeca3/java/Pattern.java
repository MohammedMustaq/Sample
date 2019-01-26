package org.oeca3.java;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr");
		int n=scn.nextInt();
		int num=1;
		int dup=2;
		for(int i=1;i<=n;i++)
		{
			for(int j=num;j<=n;j++)
			{
				System.out.print(j);
			}
			
			for(int k=dup;k<=i;k++)
				
			{
				for(int l=1;l<i;l++) 
				{
					System.out.print(l);
					
				}
				break;
		
			}
			
			System.out.println();
			num+=1;
			
		
			
			
		}
	}

}
