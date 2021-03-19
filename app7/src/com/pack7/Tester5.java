package com.pack7;
class A5
{
	A5(int i)
	{
		System.out.println("from A(int)");
	}
	A5()
	{
		this(90);
		System.out.println("from A()");
	}
}
class B5 extends A5
{
	B5()
	{
		//super(30);
		System.out.println("from B()");
	}
}
public class Tester5 
{
	public static void main(String[] args) 
	{
		B5 b1 = new B5();
	}
}
