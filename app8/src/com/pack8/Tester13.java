package com.pack8;
abstract class A13
{
	void test()
	{
		this.test1();
		super.toString();
	}
	abstract void test1();
	abstract void test2();
	
}
abstract class B13 extends A13
{
	void test1()
	{
	}
}
class C13 extends B13
{
	void test2()
	{
	}
}
public class Tester13 
{
	public static void main(String[] args) 
	{
		A13 rv;
		//A13 rv1 = new A13();
		//new B13();
		new C13();
		System.out.println("Hello World!");
	}
}
