package org.oeca3.java;

public class Method 
{
	int a;
	 static int count=0;
	 {
		 a=10;
		 count++;
	 }
	Method()
	{
		
		
	}
	Method(int i)
	{
		System.out.println(a);
		
	
	}
	Method(double d)
	{
		
	}

	public static void main(String[] args) 
	{
		Method m=new Method(10);
		Method m1=new Method();
		System.out.println(m1.a);
		System.out.println(count);
		

	}

}
