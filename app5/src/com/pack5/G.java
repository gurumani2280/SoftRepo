package com.pack5;

public class G 
{
	int a = 90;
	
	public static void main(String[] args)
	{
		System.out.println("main starts");
		int a = 10;
		System.out.println("the value of a is  : " + a);
		G rv = new G();
		System.out.println("the value of a is  : " + rv.a);
		System.out.println("the value of a is  : " + a);
		System.out.println("main ends");
	}
}
