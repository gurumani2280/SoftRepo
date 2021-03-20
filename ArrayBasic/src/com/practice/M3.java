package com.practice;

public class M3 
{
	public static void main(String[] args) 
	{
		int[] elements = new int[3];
		System.out.println("@step1: "+elements[0]+", "+elements[1]+", "+elements[2]);
		elements[0] = 10;
		elements[1] = 20;
		elements[2] = 30;
		System.out.println("@step2: "+elements[0]+", "+elements[1]+", "+elements[2]);
	}
}
