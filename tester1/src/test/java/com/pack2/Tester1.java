package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("anyName");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("someLAstNAme");
		Thread.sleep(1000);
		driver.findElement(By.id("address")).sendKeys("MY Adddress");
		Thread.sleep(1000);
		driver.findElement(By.name("gender")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='f']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='java']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='testing']")).click();
		Thread.sleep(2000);
		driver.quit();


	}

}
