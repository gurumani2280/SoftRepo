package com.pack3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tester2 extends SuperTest{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://www.istqb.in");
		Actions actions=new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("FOUNDATION"));
		actions.moveToElement(menu).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("ENROLLMENT")).click();
		Thread.sleep(2000);
		Set<String> allWH = driver.getWindowHandles();
		Iterator<String> itr = allWH.iterator();
		String parentWh = itr.next();
		String childWh = itr.next();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("=========");
		driver.switchTo().window(childWh);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("Name")).sendKeys("CandidateName");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		System.out.println("=========");
		driver.switchTo().window(parentWh);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Public exam")).click();
		Thread.sleep(2000);
	}

}
