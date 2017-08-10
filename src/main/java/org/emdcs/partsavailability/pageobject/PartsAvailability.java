package org.emdcs.partsavailability.pageobject;

import java.awt.AWTException;
import java.io.IOException;

import org.emdcs.partsreturns.pageobject.CreatePartsReturnRequest;
import org.openqa.selenium.Alert;
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

public class PartsAvailability {

	private WebDriver driver;
	public PartsAvailability(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Webelements of Login Page and Security Question Page
	@FindBy(linkText="Parts Availability")
	WebElement partsavailability;	
	@FindBy(id="PART1")
	WebElement PartsNumber1;
	@FindBy(id="PART2")
	WebElement PartsNumber2;
	@FindBy(id="PART3")
	WebElement PartsNumber3;
	@FindBy(id="PART4")
	WebElement PartsNumber4;
	@FindBy(id="PART5")
	WebElement PartsNumber5;
	@FindBy(id="PART6")
	WebElement PartsNumber6;
	@FindBy(id="PART7")
	WebElement PartsNumber7;
	@FindBy(id="PART8")
	WebElement PartsNumber8;
	@FindBy(id="PART9")
	WebElement PartsNumber9;
	@FindBy(id="PART10")
	WebElement PartsNumber10;
	@FindBy(id="PART11")
	WebElement PartsNumber11;
	@FindBy(id="PART12")
	WebElement PartsNumber12;
	@FindBy(id="QTY1")
	WebElement quantity1;
	@FindBy(id="QTY2")
	WebElement quantity2;
	@FindBy(id="QTY3")
	WebElement quantity3;
	@FindBy(id="QTY4")
	WebElement quantity4;
	@FindBy(id="QTY5")
	WebElement quantity5;
	@FindBy(id="QTY6")
	WebElement quantity6;
	@FindBy(id="QTY7")
	WebElement quantity7;
	@FindBy(id="QTY8")
	WebElement quantity8;
	@FindBy(id="QTY9")
	WebElement quantity9;
	@FindBy(id="QTY10")
	WebElement quantity10;
	@FindBy(id="QTY11")
	WebElement quantity11;
	@FindBy(id="QTY12")
	WebElement quantity12;
	@FindBy(xpath="html/body/form[2]/center/table/tbody/tr/td[1]/div/input")
	WebElement performStockOrderInquiry ;
	@FindBy(xpath="html/body/form[1]/table/tbody/tr/td[1]/div/b/select")
	WebElement selectdealer;
	@FindBy(xpath="html/body/form[2]/center/table/tbody/tr/td[3]/input")
	WebElement resetButton;
	@FindBy(xpath="html/body/form[2]/center/table/tbody/tr/td[2]/input")
	WebElement submit;
	
	 
	
	//Method to type the email id
	public PartsAvailability clickPartsAvailability() {
		partsavailability.click();
		return this;
		}
	public PartsAvailability enterPartsNumber1() {
		PartsNumber1.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber2() {
		PartsNumber2.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber3() {
		PartsNumber3.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber4() {
		PartsNumber4.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber5() {
		PartsNumber5.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber6() {
		PartsNumber6.sendKeys("BR70");
		return this;
		}
	public PartsAvailability enterPartsNumber7() {
		PartsNumber7.sendKeys("BR70");
		return this;
		}
	public PartsAvailability enterPartsNumber8() {
		PartsNumber8.sendKeys("BR70");
		return this;
		}
	public PartsAvailability enterPartsNumber9() {
		PartsNumber9.sendKeys("BR70");
		return this;
		}
	public PartsAvailability enterPartsNumber10() {
		PartsNumber10.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber11() {
		PartsNumber11.sendKeys("EG22");
		return this;
		}
	public PartsAvailability enterPartsNumber12() {
		PartsNumber12.sendKeys("EG22");
		return this;
		}

	public PartsAvailability enterquantity1() {
		quantity1.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity2() {
		quantity2.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity3() {
		quantity3.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity4() {
		quantity4.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity5() {
		quantity5.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity6() {
		quantity6.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity7() {
		quantity7.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity8() {
		quantity8.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity9() {
		quantity9.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity10() {
		quantity10.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity11() {
		quantity11.sendKeys("1");
		return this;
		}
	public PartsAvailability enterquantity12() {
		quantity12.sendKeys("1");
		return this;
		}
	public PartsAvailability enterTab1() {
		quantity12.sendKeys(Keys.TAB);
		return this;
		}
	public PartsAvailability clickOnSubmit() {
		submit.click();
		return this;
		}
	public PartsAvailability clickOnPerformStockOrderInquiry() {
		performStockOrderInquiry.click();
		return this;
		}
	public PartsAvailability Selectdealer(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByVisibleText(sOption);
		return this;
		}
	public PartsAvailability clickOnResetButton() {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", resetButton);
		return this;
		}
	//Method calls all methods to perform necessary actions
}
