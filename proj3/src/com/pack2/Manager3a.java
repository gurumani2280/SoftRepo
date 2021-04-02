package com.pack2;

public class Manager3a {
	//NullPointerException
	static Integer obj ;
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			int i = obj;
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}
