package com.pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client3 {
 // //Q.SCRIPT TO EXPLAIN StaleElementReferenceException
	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		Thread.sleep(1000);
		WebElement userName = driver.findElement(By.name("username"));
		driver.findElement(By.linkText("google")).click();
		driver.navigate().back();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		userName = driver.findElement(By.name("username"));
		userName.sendKeys("anyName");
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
