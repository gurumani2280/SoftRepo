package com.pack1;

import java.util.ArrayList;

public class M1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(15); // boxing to Integer -- upcasting to Object
		System.out.println(list.size());
		list.add(1.5); // boxing to Double -- upcasting to Object
		list.add(true);
		list.add('A');
		list.add("String"); // upcasting to Object
		System.out.println(list.size());
		list.add(15);
		list.add(null);
		
		System.out.println(list);
		System.out.println(list.size());
		
		Object obj = list.get(4);
		System.out.println(obj);
	
		System.out.println("=========");
		String s = (String)obj;
		
		System.out.println(s.length());

	}

}
