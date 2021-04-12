package com.pack1;

import java.util.ArrayList;

public class M1d {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");//
		list.add("hello");
		list.add("String");
		///list.add(16);
		
		list.add(null);
		System.out.println(list);
		System.out.println("=====");
		for(String s: list)
		{
			//String s = (String)obj;
			if(s != null)
			System.out.print(s.length()+ ", ");
		}
		System.out.println("\n=======");
		list.add(2, "there");
		list.add("hi");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println(list.size());



	}

}
