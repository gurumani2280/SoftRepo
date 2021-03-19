package com.pack7;
class A7
{
	void test()
	{
		System.out.println("from test() of A");
	}
}
class B7 extends A7
{
	void test()
	{
		super.test();
		System.out.println("from test() of B");
	}
}
public class Tester7
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		B7 b1  = new B7();
		b1.test();
		System.out.println("main");
	}
}
