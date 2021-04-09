package com.pack1;

public class Manager3 {
	//NullPointerException
	static String s;
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = s.length();
		System.out.println("main ends");

	}

}
