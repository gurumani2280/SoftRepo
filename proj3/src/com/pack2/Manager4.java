package com.pack2;

public class Manager4 {
	//ArrayIndexoutofbound Exception
	public static void main(String[] args) {
		System.out.println("main begin");
		int[] arr = {1, 2, 4};
		try
		{
			System.out.println(arr[20]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException ");
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main ends");

	}

}
