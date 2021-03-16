package com.pack4;

public class I
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("------");
		boolean b1 = test();
		System.out.println(b1);
		System.out.println("------");
		System.out.println(test());
		System.out.println("------");
	}
	public static boolean test()
	{
		System.out.println("from test");
		return true;
	}
}
	