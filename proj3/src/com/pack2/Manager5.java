package com.pack2;

public class Manager5 {
	//NumberFormatException
	public static void main(String[] args) {
		System.out.println("main begin");
		String s = "10.0";
		try
		{
			int i = Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}
