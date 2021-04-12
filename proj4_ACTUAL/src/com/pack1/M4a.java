package com.pack1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M4a {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a1", 90);
		map.put("a2", 190);
		map.put("a3", 290);
		System.out.println(map);
		System.out.println("=======");
		Set<String> set= map.keySet();
		for(String s : set)
		{
			System.out.println("key "+ s+" : value "+ map.get(s));
		}
		System.out.println("=======");
		Set<Entry<String, Integer>> set1 =map.entrySet();
		for(Entry<String, Integer> entry: set1)
		{
			System.out.println("key "+entry.getKey()+" : value "+ entry.getValue());
		}

	}

}
