package com.pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class M1a {
	
	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		Thread.sleep(1000);
		EventFiringWebDriver r=new EventFiringWebDriver (driver);
		r.executeScript("prompt('Hi')");
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("just1Enter");
		Thread.sleep(3000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alert text "+ alertText);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.quit();
	}

}
