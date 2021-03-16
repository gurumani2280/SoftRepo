package com.pack4;

public class B
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();                                   //method calling
		System.out.println("main end");
	}
	public static void test()                     //  method definition
	{
		System.out.println("from test");
	}
}