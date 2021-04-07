package com.pack3;

import java.util.Set;

import org.testng.annotations.Test;

public class Tester1a extends SuperTest{

	@Test
	public void test() {
		driver.get("http://www.naukri.com/");
		Set<String> allWH = driver.getWindowHandles();
		
		int count = allWH.size();
		
		System.out.println(count);
		
		for (String wh : allWH) {
			driver.switchTo().window(wh);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			driver.close();
		}
	}

}
