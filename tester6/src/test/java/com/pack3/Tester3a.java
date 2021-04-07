package com.pack3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tester3a extends SuperTest{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		driver.findElement(By.name("resume")).sendKeys("C:\\Users\\tester_android\\Downloads\\RentAgreement\\SampleRentAgreement.docx");
		Thread.sleep(5000);
	}

}
