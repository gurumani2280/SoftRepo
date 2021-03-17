package com.pack5;

public class A 
{

	public void test()
	{
		System.out.println("from Test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A rv = new A();
		rv.test();
		rv.test();
		rv.test();
		//test();
		System.out.println("main end");
	}
}
