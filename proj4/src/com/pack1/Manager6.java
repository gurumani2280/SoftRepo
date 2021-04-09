package com.pack1;

public class Manager6 {
	//StackOverFlowError
	public static void test()
	{
		test();
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		test();
		System.out.println("main ends");

	}

}
