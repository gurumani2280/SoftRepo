package com.pack9;
interface A18
{
	int i = 10;
	
}
class B18 implements A18
{


}


public class Tester18
{
	public static void main(String[] args) 
	{
		
		System.out.println("main");
		
		System.out.println("A18.i "+ A18.i);
		System.out.println("B18.i "+ B18.i);
	}


}
