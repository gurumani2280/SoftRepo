package com.pack8;
abstract class A14
{
	A14()
	{
		System.out.println("A()");
	}
	
}
class B14 extends A14
{
	B14()
	{
		System.out.println("B()");
	}
}
public class Tester14
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		A14 rv;
		//A14 rv1 = new A14();
		B14 b1 = new B14();
		System.out.println("main");
	}
}
