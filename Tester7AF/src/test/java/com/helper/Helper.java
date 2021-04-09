package com.helper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Helper {
	
	public static void takeScreenShot(String dest, WebDriver driver )
	{
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Screenshot/"+dest+".png");
		try {
			FileHandler.copy(srcfile,destfile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void switchToWindow(WebDriver driver){
		
		Set<String> wndHandles = driver.getWindowHandles();
		Iterator<String> it = wndHandles.iterator();
		it.next();
		driver.switchTo().window(it.next());
		
	}
	
	public static void switchToWindow(WebDriver driver, 
			String expectedTitle){
		
		Set<String> wndHandles = driver.getWindowHandles();
		Iterator<String> it = wndHandles.iterator();
		
		while(it.hasNext()){
			
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().equals(expectedTitle)){
				break;
			}
		}		
	}

}