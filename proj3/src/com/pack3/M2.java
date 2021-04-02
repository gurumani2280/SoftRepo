package com.pack3;

public class M2 {
	//ClassNotFoundException
	public static void main(String[] args) {
		
		System.out.println("main begin");

		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("main ends");

	}

}
