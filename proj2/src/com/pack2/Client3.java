package com.pack2;

public class Client3 {
	// some String methods
	public static void main(String[] args) {
		String rv = "India is my Country";
		System.out.println(rv.length());
		System.out.println(rv.charAt(4));
		System.out.println(rv.indexOf('i'));
		System.out.println(rv.indexOf('n', 2));
		System.out.println("========");
		System.out.println(rv.toUpperCase());
		System.out.println(rv.startsWith("India"));
		System.out.println("============");
		System.out.println(rv.substring(6));
		System.out.println(rv.substring(6, 8));
		
		

	}

}
