package com.pack10;

class A6
{
	void test()
	{
		System.out.println("test() of A");
	}
}
class B6 extends A6
{
	void test()
	{
		System.out.println("test() of B");
	}
}
public class Tester6 
{
	public static void main(String[] args) 
	{
		A6 rv = (A6)new B6();
		A6 rv1 = new B6();

		System.out.println("=========");
		rv.test();
		
		System.out.println("Hello World!");
	}
}
