package com.pack3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tester4 {

	public static void main(String[] args) throws InterruptedException {

		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.out.println(driverPath);
		
		   
		   String fileDownloadPath = "downloads";
		   
		   Map<String, Object> prefsMap = new HashMap<String, Object>();
		   prefsMap.put("profile.default_content_settings.popups", 0);
		   prefsMap.put("download.default_directory", System.getProperty("user.dir") + File.separator + fileDownloadPath + File.separator);
		   System.out.println("download location  "+ System.getProperty("user.dir") + File.separator + fileDownloadPath + File.separator);
		   ChromeOptions option = new ChromeOptions();
		   option.setExperimentalOption("prefs", prefsMap);
		   option.addArguments("--test-type");
		   option.addArguments("--disable-extensions");
		   
		   WebDriver driver  = new ChromeDriver(option);
		   driver.get("https://selenium.dev/downloads/");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   //driver.findElement(By.linkText("64 bit Windows IE")).click();
		   driver.findElement(By.linkText("32 bit Windows IE")).click();
		   System.out.println("Downloaded to "+ System.getProperty("user.dir") + File.separator + fileDownloadPath + File.separator);
		   	Thread.sleep(12000);
		   	driver.quit();
		   	  
		 }

}
