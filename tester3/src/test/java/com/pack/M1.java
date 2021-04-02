package com.pack;

import org.testng.annotations.Test;

public class M1 {
	
	
	@Test
	public void test()
	{
		System.out.println("from test");
		int i = 10/0;
		System.out.println("test end");
	}

}
