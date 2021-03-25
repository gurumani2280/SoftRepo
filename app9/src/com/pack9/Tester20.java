package com.pack9;
interface A20
{
	public default void test()
	{
		System.out.println("test() in A");
	}
	
}
class B20 implements A20
{
}
public class Tester20
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		B20 b1 = new B20();
		b1.test();
		
		
	}
}
