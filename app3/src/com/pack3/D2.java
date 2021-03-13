package com.pack3;

public class D2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		do
		{
			System.out.println("loop:" + i);
			i++;
		}
		while (i <= 0);
		System.out.println("main end:" + i);
	}
}
