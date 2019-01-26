package org.oeca3.java;

public class Prac {


	 static int revDigit(int n)
	 {
		 int rev=0;
		 while(n!=0)
		 {
			 int num=n%10;
			 rev=rev*10+num;
			 n=n/10;
		 }
		 return rev;
	 }
		public static void main(String[] args) {
			int ar [] = {232, 12, 78, 898, 34543, 45};
	
			int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==revDigit(ar[i]))
				count++;
		}
		System.out.println(count);

	}

}
