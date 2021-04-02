package com.pack2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class M4 {

	@Test
	public void test() {
		Reporter.log("Step1", true);
		Assert.assertEquals("abc", "xyz");
		Reporter.log("step2", true);
	}

}
