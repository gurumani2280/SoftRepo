package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		driver.navigate().to("https://www.seleniumhq.org/");
		//Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		//Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().forward();
		//Thread.sleep(2000);
		driver.quit();

	}

}
