package com.pack5;

public class  C
{
	static int j;

	public static void test2()
	{
		System.out.println("from Test2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test2();
		
		System.out.println("main end " + j);
	}
}
