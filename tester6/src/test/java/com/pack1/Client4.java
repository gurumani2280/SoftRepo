package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client4 {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.istqb.in");
		Actions actions=new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("FOUNDATION"));
		actions.moveToElement(menu).perform();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("ABOUT ISTQB FL"));
		Thread.sleep(2000);
		actions.contextClick(link).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
