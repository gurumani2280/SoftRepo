package com.pack1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class M4 {
	
	public static void main(String[] args) {
		//HashMap<String, Integer> map = new HashMap<>();
		//LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("a1", 90);
		map.put("a2", 190);
		map.put("a3", 290);
		System.out.println(map);
		map.put("a3", 390);
		System.out.println(map);
		map.put(null, 490);
		System.out.println(map);
		map.put(null, 590);
		System.out.println(map);
		System.out.println(map.get("a1"));
		System.out.println(map.get(null));
		System.out.println(map.get("null"));
		System.out.println(map.get(56));
		
	}

}
