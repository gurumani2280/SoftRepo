package com.pack4;

public class K3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(isPrime(5));
		System.out.println(isPrime(6));
		System.out.println(isPrime(7));
		System.out.println(isPrime(10));
		System.out.println(isPrime(11));
		System.out.println(isPrime(51));
		System.out.println(isPrime(47));
		
	}

	public static boolean isPrime(int num)
	{
		System.out.println("Inside isPrime "+ num);
		boolean retData = true;
		for(int i = 2; i <= num/2; i++ )
		{
			if(num % i == 0)
			{
				retData = false;
				break;
			}
		}
		return retData;

	}

}
