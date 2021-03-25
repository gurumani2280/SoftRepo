package com.pack10;

class A
{
	int i;
}
class B extends A
{
	int j;
}
public class Tester5 
{
	public static void main(String[] args) 
	{
		A rv = (A)new B();
		A rv1 = new B();

		System.out.println("=========");
		System.out.println("rv.i" + rv.i);
		//System.out.println("rv.j "+ rv.j);
		System.out.println("Hello World!");
	}
}
