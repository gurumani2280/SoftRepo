package com.pack10;

class A5a
{
	void test()
	{
		System.out.println("test() of A()");
	}
}
class B5a extends A5a
{
	void test1()
	{
		System.out.println("test1() of B()");
	}
}
public class Tester5a
{
	public static void main(String[] args) 
	{
		A5a rv = (A5a)new B5a();
		A5a rv1 = new B5a();

		System.out.println("=========");
		rv.test();
		//rv.test1();
		System.out.println("Hello World!");
	}
}
