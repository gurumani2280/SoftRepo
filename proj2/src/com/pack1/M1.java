package com.pack1;

public class M1 {

	public static void main(String[] args) {
		int i = 12; // primitive
		System.out.println(i);
		Integer obj1 = new Integer(i); // primitive to integer obj
		System.out.println(obj1.toString());// wrapper obj to String
		System.out.println(obj1.hashCode());
		System.out.println("============");
		Integer obj2 = Integer.valueOf(i);// Another way to convert primitive to Object
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		System.out.println(obj2.equals(obj1));
		System.out.println("============");
		
		int j = obj2.intValue();// converting Integer obj to primitive
		System.out.println(j);
		System.out.println("============");
		
		String s1 = Integer.toString(i);// converting primitive to String 
		System.out.println(s1.charAt(1));
		
		System.out.println("============");
		
		String s2 = obj1.toString();//converting wrapper obj to String
		System.out.println(s2);
		
		System.out.println("============");
		
		int k = Integer.parseInt(s1);//Converting String to respective primitive
		
		System.out.println(k);
		
		
		Integer obj3 = Integer.valueOf("25");//Converting String to respective Wrapper Object
		System.out.println(obj3);

	}

}
