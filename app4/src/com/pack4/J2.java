package com.pack4;

public class J2
{
	public static void main(String[] args)
	{
		System.out.println("from main");
		test(10,20);
	}
	public static void test(int i, int j)
	{
		System.out.println("from test:" + i + "," + j);
	}
}