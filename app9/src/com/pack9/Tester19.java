package com.pack9;
interface A19
{
}
interface B19 extends A19
{
}
class C19
{
}
class D19 extends C19 implements A19, B19
{
}
public class Tester19 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
