package com.pack2;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class M5 {

	@Test
	public void test() {
		SoftAssert s = new SoftAssert();
		Reporter.log("Step1", true);
		s.assertEquals("xyz", "abc", "failed-not matching");
		Reporter.log("Step2", true);
		s.assertEquals("abc", "abc", "passes1");
		Reporter.log("Step3", true);
		s.assertAll();
		Reporter.log("Step4", true);
	}

}
