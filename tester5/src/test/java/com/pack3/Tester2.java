package com.pack3;

import org.testng.annotations.Test;

import com.pages.ActitimeLogin;

public class Tester2 extends SuperTest{
	
	
	@Test
	public void atitimeLogin3()
	{
		System.out.println("login test");
		ActitimeLogin al = new ActitimeLogin(driver);
		al.login("trainee", "trainee");
	}
}
