package com.practice;

public class M5 
{
	public static void main(String[] args) 
	{
		boolean[] elements = new boolean[3];
		System.out.println("@step1: "+elements[0]+", "+elements[1]+", "+elements[2]);
		elements[0] = true;
		elements[1] = elements[0];
		elements[2] = !elements[0];
		System.out.println("@step2: "+elements[0]+", "+elements[1]+", "+elements[2]);
	}
}
