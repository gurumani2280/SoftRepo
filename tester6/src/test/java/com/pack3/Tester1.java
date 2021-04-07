package com.pack3;

import java.util.Set;

import org.testng.annotations.Test;

public class Tester1 extends SuperTest{

	@Test
	public void test() throws InterruptedException {
		
		driver.get("http://www.naukri.com/");
		String mTitle = driver.getTitle();
		Set<String> allWH = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : allWH) {
			System.out.println(wh);
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			
			if (mTitle.equals(title)) {
				System.out.println("Main Browser is " + mTitle);
			} else {
				System.out.println(title + " - child browser is closed");
				driver.close();
			}
			Thread.sleep(2000);
		}
		
		

	}

}
