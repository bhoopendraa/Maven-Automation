package org.emdcs.partsordering.pageobject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.DMSMethod;
import core.UploadFileRobot;
import dataobject.DMSTestData;
import dataobject.Logindata;

public class DMS_CSO_Ordering {

	private WebDriver driver;
	public DMS_CSO_Ordering(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Webelements of Login Page and Security Question Page
	@FindBy(linkText="Parts Ordering Menu")
	WebElement partsordermenu;
	
	@FindBy(linkText="DMS File Transfer (SSO,CSO)")
	WebElement dmsfiletrasfer;
	
	@FindBy(name="partsOrderDTO.dmsfile")
	WebElement partsOrderDTOfileupload;
	@FindBy(xpath="html/body/form/table[2]/tbody/tr[12]/td/input[2]")
	WebElement revieworder;
	
	@FindBy(xpath="html/body/form/table/tbody/tr/td[1]/select")
	WebElement selectdealer;
	@FindBy(xpath="html/body/form/table[2]/tbody/tr[12]/td/input[1]")
	WebElement orderbutton;
	
	 
	
	//Method to type the email id
	public DMS_CSO_Ordering clickpartsordermenu() {
		partsordermenu.click();
		return this;
		}
	
	//Method to Type password
	public DMS_CSO_Ordering clickdmsfiletrasfer() {
		dmsfiletrasfer.click();
		return this;
		}
	
	public DMS_CSO_Ordering clickpartsOrderDTOfileupload() {
		partsOrderDTOfileupload.click();
		return this;
		}
	public DMS_CSO_Ordering clicrevieworder() {
		revieworder.click();
		return this;
		}
	public DMS_CSO_Ordering Selectdealer(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByVisibleText(sOption);
		return this;
		}
	public DMS_CSO_Ordering clicorderbutton() {
		orderbutton.click();
		return this;
		}
	//Method calls all methods to perform necessary actions
	
}
