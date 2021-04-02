package com.pack1;

import org.testng.annotations.Test;

public class Tester2 extends SuperTest{

	@Test
	public void test1()
	{
		System.out.println("test1");
	}

	@Test()
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}

}
