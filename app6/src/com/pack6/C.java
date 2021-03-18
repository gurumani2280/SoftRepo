package com.pack6;

public class C 
{
	C(int i)
	{
		System.out.println("argument contructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		// C rv = new C();
		C rv1 = new C(90);
		System.out.println("main end");
	}
}
