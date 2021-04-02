package com.pack2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class M3 {

	@Test(priority = 2)
	public void createUser() {
		Reporter.log("Create User", true);
		Assert.fail();
	}

	@Test(priority = 1, dependsOnMethods = { "createUser" })
	public void deleteUser() {
		Reporter.log("Delete User", true);
	}

}
