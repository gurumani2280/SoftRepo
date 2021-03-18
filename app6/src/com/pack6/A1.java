package com.pack6;

public class A1 
{
	int i;
	A1()
	{
		System.out.println("in A1()" + i);
		i = 20; 
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		A1 rv = new A1();
		System.out.println("i for rv is " + rv.i);
		A1 rv1 = new A1();
		System.out.println("i for rv1 is " + rv1.i);
		System.out.println("main ends");
	}
}
