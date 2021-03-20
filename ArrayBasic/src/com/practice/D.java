package com.practice;

public class D
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		int[] arr = {4,2, 5, 6};
		//System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) // ordinary for loop
		{
			System.out.println(arr[i]);
		}
		System.out.println("=============");
		for(int a: arr) // enhanced for loop used only for reading array or collection object -- also called for each for loop
		{
			System.out.println(a);
		}
		System.out.println("done");
		

	}
}
