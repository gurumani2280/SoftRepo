package com.pack5;

public class K 
{
	static int a = 90;
	public static void main(String[] args)
	{
		System.out.println("main starts");
		System.out.println("the value of a is  : " + a);
		a = 20;
		System.out.println("the value of a is  : " + a);
		int a = 10;
		System.out.println("the value of a is  : " + a);
		a = 40;
		System.out.println("the value of a is  : " + a);
		System.out.println("the value of a is  : " + K.a);
		System.out.println("main ends");
	}
}
