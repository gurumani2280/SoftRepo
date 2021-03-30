package com.pack3;

public class A {
	
	int i;
	

	public static void main(String[] args) {
	

		A rv = new A();
		rv.i =10;
		System.out.println(rv.toString());
		System.out.println(rv);
		System.out.println(rv.hashCode());
		System.out.println("==========");
		A rv1 = rv;
		System.out.println(rv1);
		System.out.println(rv1.hashCode());
		System.out.println("=========");
		A rv2 = new A();
		rv2.i = 10;
		System.out.println(rv2);
		System.out.println(rv2.hashCode());
		System.out.println("=============");
		System.out.println(rv.equals(rv1));
		System.out.println(rv.equals(rv2));

	}
	
	
	


}
