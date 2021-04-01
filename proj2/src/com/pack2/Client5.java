package com.pack2;

public class Client5 {
	// String Buffer and Builder are mutable and hence content getting added/appended
	public static void main(String[] args) {
		System.out.println("Hello World!");
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		//sb.append("abc");
		//sb.append("abc");
		//sb.append("abc");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1);
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb.equals(sb1));
		
		sb.reverse();
		System.out.println(sb);
		
		

	}

}
