package com.pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class M3 {
	
	public static void main(String[] args) throws InterruptedException
	{
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		RemoteWebDriver rv= (RemoteWebDriver) driver;
		String c="window.scrollTo(0,document.body.scrollHeight)";
		rv.executeScript(c);
		Thread.sleep(3000);
		driver.quit();
	}

}
