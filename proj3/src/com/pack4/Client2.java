package com.pack4;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			//throw new AgeNegativeException();
			throw new AgeNegativeException("Age cannot be zero or less than zero");
		}
		else
		{
			System.out.println("You can proceed for registration");
		}
		System.out.println("main end");
			

	}

}

class AgeNegativeException extends ArithmeticException{
	
	public AgeNegativeException()
	{
		
	}
	
	public AgeNegativeException(String msg)
	{
		super(msg);
	}

	
}
