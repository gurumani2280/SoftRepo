package com.pack4;

public class I1
{
	public static void main(String[] args)
	{
		System.out.println("from main");
		char i = test();
		System.out.println("from main:" + i);
	}
	public static char test()
	{
		System.out.println("from test");
		return 'r';
	}
}