package com.pack1;

import org.testng.annotations.Test;

public class Tester4 extends SuperTest{
	
	@Test
	public void test7()
	{
		System.out.println("test7");
	}

	@Test(enabled = false)
	public void test8()
	{
		System.out.println("test8");
	}
	
	@Test(invocationCount = 4)
	public void test9()
	{
		System.out.println("test9");
	}

}
