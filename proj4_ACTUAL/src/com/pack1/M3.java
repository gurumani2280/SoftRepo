package com.pack1;

import java.util.HashSet;

public class M3 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		System.out.println(set.add(19));
		System.out.println(set.add(129));
		System.out.println(set.add(19));
		System.out.println(set.add(190));
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set);
		System.out.println(set.size());
		for(Integer i : set)
		{
			System.out.println(i);
		}

	}

}
