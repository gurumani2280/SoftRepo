package com.pack6;

public class H
{
	public static void test()
	{
		System.out.println("from test()");
		test(90);
	}
	public static void test(int i)
	{
		System.out.println("from test(int )" + i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		test();

	}
}
