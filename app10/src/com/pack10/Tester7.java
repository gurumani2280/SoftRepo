package com.pack10;

class A7
{
	void test()
	{
		System.out.println("test() of A");
	}
}
class B7 extends A7
{
	void test2()
	{
		System.out.println("test2() of B");
	}
}
public class Tester7 
{
	public static void main(String[] args) 
	{
		//B7 rv1 = new A7();
		B7 rv = (B7)new A7();

		System.out.println("=========");
		//rv.test();
		//rv.test2();
		System.out.println("Hello World!");
	}
}
