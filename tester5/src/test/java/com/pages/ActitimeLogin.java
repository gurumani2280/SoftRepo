package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin {
	
	WebDriver driver;
	int i = 10;
	
	public ActitimeLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement usernameField;
	
	
	@FindBy(name="username1")
	private List<WebElement> usernameFields;
	
	@FindBy(name="pwd")
	private WebElement passwordField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void login(String username, String pwd)
	{
		usernameField.sendKeys(username);
		passwordField.sendKeys(pwd);
		loginButton.click();
	}

}
