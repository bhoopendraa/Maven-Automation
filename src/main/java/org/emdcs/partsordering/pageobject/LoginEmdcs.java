package org.emdcs.partsordering.pageobject;

import java.io.IOException;

import org.emdcs.test.utility.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataobject.Logindata;

public class LoginEmdcs {
	
	private WebDriver driver;
	public LoginEmdcs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Webelements of Login Page and Security Question Page
	@FindBy(name="username")
	WebElement enterusername;
	
	@FindBy(name="password")
	WebElement enterpassword;
	
	@FindBy(name="SUBMIT")
	WebElement login;
	
	
	
	//Method to Open Browser for NS URL 
	public LoginEmdcs openEMDCS(String URL){
		
		//driver.manage().window().maximize();
		driver.get(URL);
		return this;
	}
	
	//Method to type the email id
	public LoginEmdcs enterUserName(String username) {
		enterusername.sendKeys(username);
		return this;
		}
	
	//Method to Type password
	public LoginEmdcs enterPassword(String password) {
		enterpassword.sendKeys(password);
		return this;
		}
	
	//Method to Click on Submit button
	public LoginEmdcs LoginSubmit() {
		login.click();
		return this;
		}
	
	
	
	
}
