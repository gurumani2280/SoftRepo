package com.pack2;

public class Manager6 {
	//StackOverFlowError
	public static void test()
	{
		try {	
		test();
		}
		catch (StackOverflowError e) {
			//e.printStackTrace();
			System.out.println("Error handled in test"+e.getMessage());
		}
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			test();
		}
		catch (StackOverflowError e) {
			//e.printStackTrace();
			System.out.println("Error handled in main "+e.getMessage());
		}
		
		System.out.println("main ends");

	}

}
