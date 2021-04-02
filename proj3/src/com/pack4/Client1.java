package com.pack4;

import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			//throw new ArithmeticException();
			throw new ArithmeticException("Age cannot be zero or less than zero");
		}
		else
		{
			System.out.println("You can proceed for registration");
		}
		System.out.println("main end");
			

	}

}


