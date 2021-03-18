package com.pack6;

public class C1 
{
	public C1(int i)
	{
		System.out.println(" from c1(int) "+ i);
	}
	public C1()
	{
		System.out.println(" from c1() ");
	}
	public static void main(String[] args) 
	{
		C1 c1 = new C1(90);
		C1 c2 = new C1();
	}
}
