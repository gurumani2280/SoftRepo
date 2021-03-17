package com.pack5;

public class  C1
{
	int i;
	static int j;
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
		C1 rv = new C1();
		rv.test1();
		System.out.println("main "+rv.i);
		System.out.println("=======");
		C1.test2();
		C1 rv2 = new C1();
		rv2.test1();
		System.out.println("main "+rv2.i);
		System.out.println("main end " + C1.j);
	}
}


