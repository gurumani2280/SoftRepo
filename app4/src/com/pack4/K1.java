package com.pack4;

public class K1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		checkEvenOdd(4);
		checkEvenOdd(13);
		checkEvenOdd(14);
		//System.out.print(checkEvenOdd(24));

	}

	public static void checkEvenOdd(int i)
	{
		if(i % 2 == 0)
		{
			System.out.println("the given number "+ i + " is EVEN");
		}
		else
		{
			System.out.println("the given number "+ i + " is ODD");
		}
		//return;
	}
}
