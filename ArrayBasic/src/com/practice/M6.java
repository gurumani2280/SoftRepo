package com.practice;

public class M6 
{
	public static void main(String[] args) 
	{
		String[] elements = new String[3];
		System.out.println("@step1: "+elements[0]+", "+elements[1]+", "+elements[2]);
		elements[0] = "abc";
		elements[1] = "hello";
		elements[2] = "test";
		System.out.println("@step2: "+elements[0]+", "+elements[1]+", "+elements[2]);
	}
}
