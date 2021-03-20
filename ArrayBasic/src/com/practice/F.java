package com.practice;

public class F
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		int[] arr = {4,2, 5, 6, 7};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("sum "+ sum);
		

	}
}
