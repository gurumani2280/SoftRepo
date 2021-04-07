package com.pack2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helper.Helper;



public class Tester2 {
	
public WebDriver driver;
	
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/");
		Assert.fail("failed");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.out.println(driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		String methodName = result.getName().trim();
		if(ITestResult.FAILURE == result.getStatus())
		{
			Reporter.log("\n*** "+methodName+ " has FAILED ***" , true);
			String fileName = methodName+"_"+
					new SimpleDateFormat("ddMMMYY_HH.mm.ss.S").format(new Date());

			Helper.takeScreenShot(fileName, driver);
		}
		driver.quit();
	}


}
