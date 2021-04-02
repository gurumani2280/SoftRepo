package com.pack1;

import org.testng.annotations.Test;

public class Tester3 extends SuperTest{
	
	@Test(priority = 2)
	public void test4()
	{
		System.out.println("test4");
	}

	@Test(priority = -1)
	public void test5()
	{
		System.out.println("test5");
	}
	
	@Test
	public void test6()
	{
		System.out.println("test6");
	}

}
