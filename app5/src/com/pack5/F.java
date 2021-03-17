package com.pack5;

public class F 
{
	public static void test(int a)
	{
		a = a + 20;
		System.out.println("from test : " + a);
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		F.test(90);
		int a = 10;
		System.out.println("from main : " + a);
		F.test(a);
		System.out.println("main ends");
	}
}
