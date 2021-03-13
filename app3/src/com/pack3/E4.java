package com.pack3;

public class E4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j ++)
			{
				if(j +i  <= 6)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("main end:");
	}
}
