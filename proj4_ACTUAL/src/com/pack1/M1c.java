package com.pack1;

import java.util.ArrayList;

public class M1c {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hi");//
		list.add("hello");
		list.add("String");
		list.add(16);
		System.out.println(list);
		
		System.out.println("=====");
		for(Object obj: list)
		{
			String s = (String)obj;
			System.out.print(s.length()+ ", ");
		}

	}

}
