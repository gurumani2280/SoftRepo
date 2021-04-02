package com.pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tester5 extends SuperTest{
	
	@Test(priority = 3)
	public void createUser()
	{
		System.out.println("createUser");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "createUser", priority = 2)
	public void deleteUser()
	{
		System.out.println("deleteUser");
	}
	
	@Test(dependsOnMethods = "createUser", priority = 1)
	public void updateUser()
	{
		System.out.println("updateUser");
		Assert.assertTrue(false);
	}

}
