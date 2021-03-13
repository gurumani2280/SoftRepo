package com.pack3;

public class E2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char c = 'A';
		for(int i = 1; i <= 5; i++, c++)
		{
			
			for(int j = 1; j <= 5; j ++)
			{
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println("main end:");
	}
}
