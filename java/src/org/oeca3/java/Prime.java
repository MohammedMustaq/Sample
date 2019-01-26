package org.oeca3.java;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		int n=scn.nextInt();
		for(int i=2;i<=n;i++)
		{
			boolean b=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}
			if(b)
			
				System.out.print(i+" ");
			
		}

	}

}
