package com.pack2;

public class Manager2 {
	//ClassCastException
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			Manager2 m = (Manager2)new Object();
		}
		catch (ClassCastException e) {
			System.out.println(e.getMessage());
			System.out.println("exception handled");
			
		}
		System.out.println("main ends");

	}

}
