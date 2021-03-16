package com.pack4;

public class J4
{
	public static void test(int i, boolean j)
	{
		System.out.println("from test:" + i + "," + j);
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		test(10,false);
	}
}