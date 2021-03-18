package com.pack6;

public class I 
{
	public I(int i)
	{
		System.out.println(" from I(int) "+ i);
	}
	public I()
	{
		this(90);
		System.out.println(" from I() ");
	}
	public static void main(String[] args) 
	{
		I rv = new I(90);
		I rv1 = new I();

		
		
	}
}
