package com.pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SuperTest {
	
public WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser)
	{
		String driverPath;
		if(browser.contains("chrome"))
		{
			driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			System.out.println(driverPath);
			System.out.println(browser);
			driver = new ChromeDriver();
			
		}
		else
		{
			driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			System.out.println(driverPath);
			System.out.println(browser);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.actitime.com/login.do");
		
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}

}
