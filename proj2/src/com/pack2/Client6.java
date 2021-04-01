package com.pack2;

public class Client6 {
	// String Builder is also mutable object like buffer
	// only difference is buffer is synchronized and builder is non synchronized
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.append("ABC");
		System.out.println(sb);

	}

}
