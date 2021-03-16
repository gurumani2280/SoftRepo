package com.pack4;

public class I2
{
	public static void main(String[] args)
	{
		System.out.println("from main");
		String s1 = test();
		System.out.println(s1);
	}
	public static String test()
	{
		System.out.println("from test");
		String s1 = "abc";
		return s1;
	}
}