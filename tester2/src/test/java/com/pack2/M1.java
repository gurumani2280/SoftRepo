package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do"); 
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title .equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Login is success");
		}
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(1000);
		driver.quit();


	}

}
