package com.pack10;

class A8
{
	void test()
	{
		System.out.println("test() of A");
	}
}
class B8 extends A8
{
	void test2()
	{
		System.out.println("test2() of B");
	}
}
public class Tester8
{
	public static void main(String[] args) 
	{
		A8 rv = new B8();
		B8 rv1 = (B8)rv;
		rv.test();
		System.out.println("=========");
		rv1.test();
		rv1.test2();
		System.out.println("Hello World!");
	}
}
