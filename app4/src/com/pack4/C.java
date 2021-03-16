package com.pack4;

public class C
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("------");
		test();
		System.out.println("------");
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("from test");
	}
}