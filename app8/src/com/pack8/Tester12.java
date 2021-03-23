package com.pack8;

abstract class A
{
	void test()
	{
	}
	abstract void test1();
	abstract void test2();
	
}
abstract class B extends A
{
	void test1()
	{
	}
}
public class Tester12 
{
	public static void main(String[] args) 
	{
		A rv;
		//A rv1 = new A();
		System.out.println("Hello World!");
	}
}
