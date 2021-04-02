package com.pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class M2 {

	public static void main(String[] args) {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		String title = driver.getTitle();
		if(title.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Login is success");
		}
		driver.findElement(By.id("logoutLink")).click();
		
		driver.quit();


	}

}
