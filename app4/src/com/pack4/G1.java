package com.pack4;

public class G1
{
	public static void main(String[] args)
	{
		System.out.println("from main");
		int i = test();
		int j = 10 + i + test();
		System.out.println("i = " + i);
		System.out.println(test());
		System.out.println("j = " + j);
	}
	public static int test()
	{
		System.out.println("from test");
		return 10;
	}
}