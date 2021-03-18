package com.pack6;

public class D 
{
	public static void test()
	{
		System.out.println("from test()");
	}
	public static void test(int i)
	{
		System.out.println("from test(int )" + i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		test();
		System.out.println("=========");
		test(90);

	}
}
