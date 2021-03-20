package com.practice;

public class G
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		int[] arr = {4, 2, 9, 6, 4*2};
		int greatest = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if (arr[i] > greatest)
			{
				greatest = arr[i];
			}
			
		}
		System.out.println("greatest "+ greatest);
		

	}
}
