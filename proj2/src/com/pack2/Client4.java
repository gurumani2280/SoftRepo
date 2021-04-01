package com.pack2;

public class Client4 {
	// immutable String
	public static void main(String[] args) {
		String s = "hi";
		
		String s1 = "hi" + "1";
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println("=======");
		s = s.toUpperCase();
		System.out.println(s);
	}

}
