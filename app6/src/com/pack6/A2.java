package com.pack6;

public class A2 
{
	int i;
	A2(int i)
	{
		this.i = i;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		A2 rv = new A2(10);
		System.out.println("i for rv is " + rv.i);
		A2 rv1 = new A2(20);
		System.out.println("i for rv1 is " + rv1.i);
		System.out.println("main ends");
		//A2 rv3 = new A2();
	}
}
