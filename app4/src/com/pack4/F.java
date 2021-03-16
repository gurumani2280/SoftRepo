package com.pack4;

public class F
{
	public static void main(String[] args)
	{
		System.out.println("from main");
		int i = test();
		System.out.println("main end:" + i);
	}
	public static int test()
	{
		System.out.println("from test");
		return '1';
	}
}