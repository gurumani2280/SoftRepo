package com.pack2;

public class Manager7 {
	//OutOfmemoryError
	public static void main(String[] args) {
		System.out.println("main begin");
		
		try
		{
			int[] i =new int[999999999];
		}
		catch (OutOfMemoryError e) {
			System.out.println("error handled "+e.getMessage());
		}
		
		System.out.println("main ends");

	}

}
