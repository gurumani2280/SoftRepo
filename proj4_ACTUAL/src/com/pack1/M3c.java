package com.pack1;

import java.util.HashSet;
import java.util.Iterator;

public class M3c {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(19);
		set.add(129);
		set.add(193);
		set.add(190);
		set.add(234);
		System.out.println(set);
		for(Integer a: set)
		{
			System.out.print(a+ ", ");
		}
		System.out.println("\n=========");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(set);

	}

}
