package com.pack4;

public class J
{
	public static void main(String[] args)
	{
		System.out.println("from main");
		test(10);
	}
	public static void test(int i)
	{
		System.out.println("from test:" + i);  // i is local to test method
	}
}