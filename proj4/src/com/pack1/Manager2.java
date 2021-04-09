package com.pack1;


public class Manager2 {
	//ClassCastException
	public static void main(String[] args) {
		System.out.println("main begin");
		Manager2 m = (Manager2)new Object();
		System.out.println("main ends");
		

	}

}
