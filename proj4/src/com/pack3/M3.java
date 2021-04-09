package com.pack3;

public class M3 {
	
	//Arithmetic Exception in for loop and finally block
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = 10;
		int[] arr = {1, 2, 0, 4, 5};
		for(int a : arr)
		{	
			try 
			{
				System.out.println(i/a);
			}
			catch (ArithmeticException e) {
				System.out.println("catch block");
			}
			finally {
				System.out.println("finally block");
			}			
			
		}
		
		
		System.out.println("main ends");
	}

}
