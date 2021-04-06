package com.pack1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester2 {
	
	@BeforeMethod
	@Parameters("param")
	public void beforeMethod(@Optional("DefValue")String param) {
		System.out.println("before Method");
		System.out.println(param);
	}

	@Test
	@Parameters("param")
	public void test(@Optional("DefValue")String param) {
		System.out.println("test");
		System.out.println(param);
	}

}
