package com.pack4;

public class E {
	
	// Derived array
		public static void main(String[] args) {
			String[] days = {"sunday", "monday", "tuesday"};
			System.out.println(days[0]);
			System.out.println(days[1].toString());
			System.out.println("==========");
			for(String s : days)
			{
				System.out.println(s.toString());
			}

		}

}
