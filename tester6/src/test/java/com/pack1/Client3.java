package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client3 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.name("username"));
		firstName.sendKeys("anyName");
		
		Thread.sleep(1000);
		
		firstName.sendKeys(Keys.CONTROL+ "a");
		Thread.sleep(1000);
		firstName.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		//firstName.sendKeys(Keys.DELETE);
		firstName.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		WebElement lstName = driver.findElement(By.id("lastname"));
		lstName.sendKeys(Keys.CONTROL+ "v");
		Thread.sleep(1000);
		lstName.sendKeys(Keys.SHIFT);
		lstName.sendKeys(Keys.HOME);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(lstName, Keys.SHIFT).sendKeys(lstName, Keys.END).perform();
		Thread.sleep(2000);
		driver.quit();


	}

}
