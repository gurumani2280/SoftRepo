package com.pack2;

public class Client1 {
	// ways to create String
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("======");
		
		char[] x = {'H', 'e', 'l', 'l', 'o'};
		String s3 = new String(x);
		System.out.println(s3);
		System.out.println("===========");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("===========");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("===========");
		System.out.println(s1 == s2);
		System.out.println(s1 == s2);

	}

}
