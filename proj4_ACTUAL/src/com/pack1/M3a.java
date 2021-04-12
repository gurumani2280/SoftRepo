package com.pack1;

import java.util.LinkedHashSet;

public class M3a {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(19);
		set.add(29);
		set.add(39);
		set.add(19);
		set.add(null);
		set.add(null);
		System.out.println(set);

	}

}
