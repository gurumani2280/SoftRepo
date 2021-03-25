package com.pack9;
interface A15a
{
	 void test();
	 public static void test1()
	{
		System.out.println("test1() in A");
	}
	
}
class B15a implements A15a
{
	 public  void test()
	{
		System.out.println("test() in B");
	}
	
}
interface C15a extends A15a {
	
}
public class Tester15a
{
	public static void main(String[] args) 
	{
		A15a rv;
		A15a.test1();
		//A a1 = new A();
		B15a b1 = new B15a();
		b1.test();
		// B15a.test1(); interface static method is not inherited to sub class or sub interface
		// C15a.test1();
		System.out.println("Hello World!");
	}
}
