package com.pack4;

public class K2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int k = add(3, 4);
		System.out.println(k);
		System.out.println(add(4, 5));

	}

	public static int add(int i, int j)
	{
		System.out.println("inside add method "+ i +" , "+j);
		int sum = i + j;
		return sum;
	}
}
