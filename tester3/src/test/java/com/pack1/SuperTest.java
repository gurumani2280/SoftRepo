package com.pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuperTest {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	

	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}

}
