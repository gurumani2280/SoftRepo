package com.pack2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.ActitimeLogin;

public class M2 extends SuperTest{
	
	@Test(dataProvider="logindata")
	public void atitimeLogin(String userName, String pwd) 
	{
		System.out.println(userName+ pwd);
		
		ActitimeLogin al = new ActitimeLogin(driver);
		al.login(userName, pwd);

	}
	
	@DataProvider(name="logindata")
	public Object[][] loginData()
	{
		return new String[][] {{"admin", "manager"},
							{"trainee", "trainee"}};
		
	}


}
