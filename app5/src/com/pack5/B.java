package com.pack5;

public class B 
{
	int i;
	public void test()
	{
		System.out.println("from Test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B rv = new B();
		rv.test();
		System.out.println("main end " + rv.i);
	}
}
