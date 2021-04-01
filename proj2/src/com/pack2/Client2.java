package com.pack2;

public class Client2 {
	//SCP - NCP
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Hello";
		String s3 = "HiHello";
		String s4 = new String("HiHello");
		String s5 = "Hi" + s2;
		String s6 = "Hi" + "Hello";
		System.out.println(s4 == s5);
		System.out.println(s6 == s5);
		System.out.println(s3 == s6);
		String s7 = "Hi".concat("Hello");
		System.out.println(s7 == s6);

	}

}
