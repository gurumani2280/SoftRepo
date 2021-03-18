package com.pack6;

public class A 
{
	public A()
	{
		System.out.println("from A()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		A rv = new A();
		// A rv1 = new A(90);
	}
}
