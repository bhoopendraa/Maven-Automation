package org.emdcs.partsordering.pageobject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import core.UploadFileRobot;
import dataobject.SSO_Orderingdata;

public class ServiceAndPartsSalesBank {

	private WebDriver driver;
	public ServiceAndPartsSalesBank(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Webelements of Login Page and Security Question Page
	@FindBy(linkText="Parts Ordering Menu")
	WebElement partsordermenu;
	
	@FindBy(linkText="Service and Parts Sales Bank")
	WebElement ServiceandPartsSalesBankLink;
	
	@FindBy(id="CHK0")
	WebElement ChecktoOrder0;
	@FindBy(id="CHK1")
	WebElement ChecktoOrder1;
	@FindBy(id="CHK2")
	WebElement ChecktoOrder2;
	@FindBy(id="CHK3")
	WebElement ChecktoOrder3;
	@FindBy(id="CHK4")
	WebElement ChecktoOrder4;
	@FindBy(id="BINLOC1")
	WebElement Comment1;
	@FindBy(xpath="html/body/form/table[4]/tbody/tr[2]/td[1]/input[1]")
	WebElement SubmitInquiry;
	
	@FindBy(xpath="html/body/form/table/tbody/tr/td[1]/select")
	WebElement selectdealer;
	@FindBy(xpath="//input[@value='Order Parts']")
	WebElement orderbutton;
	@FindBy(xpath="html/body/form/table[4]/tbody/tr[2]/td[1]/input[3]")
	WebElement resetButton;
	
	 
	
	//Method to type the email id
	public ServiceAndPartsSalesBank clickpartsordermenu() {
		partsordermenu.click();
		return this;
		}
	
	//Method to Type password
	public ServiceAndPartsSalesBank clickOnServiceandPartsSalesBankLink() {
		ServiceandPartsSalesBankLink.click();
		return this;
		}
	public ServiceAndPartsSalesBank selectChecktoOrder0() {
		ChecktoOrder0.click();
		return this;
		}
	public ServiceAndPartsSalesBank selectChecktoOrder1() {
		ChecktoOrder1.click();
		return this;
		}
	public ServiceAndPartsSalesBank selectChecktoOrder2() {
		ChecktoOrder2.click();
		return this;
		}
	public ServiceAndPartsSalesBank selectChecktoOrder3() {
		ChecktoOrder3.click();
		return this;
		}
	public ServiceAndPartsSalesBank selectChecktoOrder4() {
		ChecktoOrder4.click();
		return this;
		}
	public ServiceAndPartsSalesBank clickOnSubmitInquiry() {
		SubmitInquiry.click();
		return this;
		}
	public ServiceAndPartsSalesBank Selectdealer(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByVisibleText(sOption);
		return this;
		}
	public ServiceAndPartsSalesBank clickOnOrderButton() {
		orderbutton.click();
		return this;
		}
	public ServiceAndPartsSalesBank clickOnResetButton() {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", resetButton);
		return this;
		}
	//Method calls all methods to perform necessary actions
	

}
