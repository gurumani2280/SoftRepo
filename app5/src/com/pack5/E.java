package com.pack5;

public class E 
{
	static int j;
	int k;
	public void test1()
	{
		System.out.println("from Test1");
	}
	public static void test2()
	{
		System.out.println("from Test2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E rv = new E();
		rv.test1();
		System.out.println("main  " + rv.k);
		E.test2();
		System.out.println("main  " + E.j);
	}
}
