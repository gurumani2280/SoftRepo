package com.pack2;

public class Manager1 {
	//ArithmeticException
	public static void main(String[] args) {
		System.out.println("main begin");
		int a = 10;
		int b = 0;
		try
		{
			int i = a/b;
		}
		catch (ArithmeticException ex) {
			System.out.println("exception handled");
		}
		
		System.out.println("main ends");

	}

}
