package com.pack9;
interface A15b
{
	public void test();
	void test1();
	
}

class B15b implements A15b
{
	public void test()
	{
		System.out.println("test() in B");
	}
	
	
	public void test1()
	{
		System.out.println("test1() in B");
	}
	
}

public class Tester15b 
{
	public static void main(String[] args) 
	{
		A15b rv;
		//A15b a1 = new A15b();
		//B15b b1 = new B15b();
		
		System.out.println("Hello World!");
	}
}
