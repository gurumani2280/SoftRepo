package com.pack1;

import java.util.ArrayList;

public class M1a {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(15);//
		list.add(1.5);
		list.add(true);
		list.add('A');
		list.add("String");
		System.out.println(list);
		for(int i = 0 ; i < list.size(); i ++)
		{
			System.out.print(list.get(i));
		}
		System.out.println("=======");
		for(Object obj : list)
		{
			System.out.print(obj+", ");
		}
		System.out.println("\n=======");
		list.add(2, 68);
		System.out.println(list);
		System.out.println("\n=======");
		ArrayList list2 = new ArrayList(list);
		System.out.println(list2);
		list2.addAll(list);
		System.out.println(list2);
		
		System.out.println(list.contains(689));
		System.out.println(list.contains(68));

	}

}
