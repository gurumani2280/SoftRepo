package com.pack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class M2 {
	
	@Test()
	public void test()
	{
		Reporter.log("Welcome to testNG- test", true);
	}
	
	@Test( groups={"smoke"})
	public void test1()
	{
		Reporter.log("Welcome to testNG - test1", true);
	}
	
	@Test( groups={"sanity"})
	public void test2()
	{
		Reporter.log("Welcome to testNG - test2", true);
	}
}
