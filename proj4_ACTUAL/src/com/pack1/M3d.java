package com.pack1;

import java.util.HashSet;

public class M3d {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		System.out.println(set.add("hi"));
		System.out.println(set.add("hello"));
		System.out.println(set.add("hi"));
		
		System.out.println(set);
		System.out.println(set.size());
		
		HashSet<StringBuffer> set1 = new HashSet<>();
		System.out.println(set1.add(new StringBuffer("hi")));
		System.out.println(set1.add(new StringBuffer("he56lo")));
		System.out.println(set1.add(new StringBuffer("hi")));
		
		System.out.println(set1);
		System.out.println(set1.size());
		
	}

}
