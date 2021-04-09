package com.pack2;

public class Manager3 {
	//NullPointerException
	static String s;
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			int i = s.length();
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}
