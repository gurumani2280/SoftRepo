package com.pack5;

public class D 
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		D rv = new D();
		rv.i = 10;
		System.out.println("main  " + rv.i);
		D rv1 = new D();
		rv1.i = 20;
		System.out.println("main  " + rv1.i);
		D rv2 = new D();
		rv2.i = 30;
		System.out.println("main  " + rv2.i);
		System.out.println("=============== ");
		System.out.println("main  " + rv1.i);
		System.out.println("main  " + rv2.i);
		System.out.println("main  " + rv.i);
		System.out.println("main end ");
	}
}
