package com.pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath); 
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println(" google page loaded ");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement googleSearchBox= driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> autoSugestion = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li"));
		System.out.println("total autosuggestions "+ autoSugestion.size());
		autoSugestion.get(5).click();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
