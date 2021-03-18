package com.pack6;

public class B 
{
	void B()
	{
		System.out.println("from B!");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B rv = new B();
		System.out.println("main end!");
		rv.B();
		
	}
}
