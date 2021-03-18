package com.pack6;

public class J 
{
	public J(int i)
	{
		System.out.println(" from c(int) "+ i);
	}
	public J()
	{
		this(90);
		System.out.println(" from c() ");
	}
	public J(boolean b)
	{
		this();
		System.out.println(" from c(boolean) " + b);
	}
	public static void main(String[] args) 
	{
		J rv = new J(true);
		
		
	}
}
