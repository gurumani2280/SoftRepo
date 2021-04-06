package com.pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tester1 extends SuperTest{
	
	
	@Test
	public void atitimeLogin()
	{
		driver.findElement(By.name("username")).sendKeys("admin");	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		String actualtitle = driver.getTitle();
		String expectedTitle = "actiTIME - Enter Time-Track";
		Assert.assertEquals(actualtitle, expectedTitle, "The title didnot match");
	}
}
