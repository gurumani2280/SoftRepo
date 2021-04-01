package com.pack1;

public class M2 {
	
	//auto boxing and un-boxing
		public static void main(String[] args) {
			int i = 90;
			Integer rv = i;// auto boxing
			int j = rv; //auto un-boxing
			
			System.out.println(rv);
			System.out.println(j);

		}

}
