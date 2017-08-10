package org.emdcs.partsreturns.pageobject;

import java.awt.AWTException;
import java.io.IOException;

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

public class CreatePartsReturnRequest {

	private WebDriver driver;
	public CreatePartsReturnRequest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Webelements of Login Page and Security Question Page
	@FindBy(linkText="Parts Returns Menu")
	WebElement partsreturnsmenu;
	
	@FindBy(linkText="Create a Parts Return Request")
	WebElement createpartsreturnrequestlink;
	
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
	@FindBy(id="PART13")
	WebElement PartsNumber13;
	@FindBy(id="PART14")
	WebElement PartsNumber14;
	@FindBy(id="PART15")
	WebElement PartsNumber15;
	@FindBy(id="PART16")
	WebElement PartsNumber16;
	@FindBy(id="PART17")
	WebElement PartsNumber17;
	@FindBy(id="PART18")
	WebElement PartsNumber18;
	@FindBy(id="PART19")
	WebElement PartsNumber19;
	@FindBy(id="PART20")
	WebElement PartsNumber20;
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
	@FindBy(id="QTY13")
	WebElement quantity13;
	@FindBy(id="QTY14")
	WebElement quantity14;
	@FindBy(id="QTY15")
	WebElement quantity15;
	@FindBy(id="QTY16")
	WebElement quantity16;
	@FindBy(id="QTY17")
	WebElement quantity17;
	@FindBy(id="QTY18")
	WebElement quantity18;
	@FindBy(id="QTY19")
	WebElement quantity19;
	@FindBy(id="QTY20")
	WebElement quantity20;
	@FindBy(id="BINLOC1")
	WebElement Comment1;
	@FindBy(xpath="html/body/form/table[4]/tbody/tr[2]/td[1]/input[1]")
	WebElement SubmitInquiry;
	
	@FindBy(xpath="html/body/form/table/tbody/tr/td[1]/select")
	WebElement selectdealer;
	@FindBy(xpath=".//*[@id='menu1']/input[3]")
	WebElement transmitpartsreturn;
	@FindBy(xpath="html/body/form/table[4]/tbody/tr[2]/td[1]/input[3]")
	WebElement resetButton;
	
	 
	
	//Method to type the email id
	public CreatePartsReturnRequest clickPartsReturnsMenu() {
		partsreturnsmenu.click();
		return this;
		}
	
	//Method to Type password
	public CreatePartsReturnRequest createPartsReturnRequestLink() {
		createpartsreturnrequestlink.click();
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber1() {
		PartsNumber1.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber2() {
		PartsNumber2.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber3() {
		PartsNumber3.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber4() {
		PartsNumber4.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber5() {
		PartsNumber5.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber6() {
		PartsNumber6.sendKeys("BR70");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber7() {
		PartsNumber7.sendKeys("BR70");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber8() {
		PartsNumber8.sendKeys("BR70");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber9() {
		PartsNumber9.sendKeys("BR70");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber10() {
		PartsNumber10.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber11() {
		PartsNumber11.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber12() {
		PartsNumber12.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber13() {
		PartsNumber13.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber14() {
		PartsNumber14.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber15() {
		PartsNumber15.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber16() {
		PartsNumber16.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber17() {
		PartsNumber17.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber18() {
		PartsNumber18.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber19() {
		PartsNumber19.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterPartsNumber20() {
		PartsNumber20.sendKeys("EG22");
		return this;
		}
	public CreatePartsReturnRequest enterComment1() {
		Comment1.sendKeys("abc");
		return this;
		}
	public CreatePartsReturnRequest enterTab1() {
		Comment1.sendKeys(Keys.TAB);
		return this;
		}
	public CreatePartsReturnRequest enterquantity1() {
		quantity1.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity2() {
		quantity2.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity3() {
		quantity3.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity4() {
		quantity4.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity5() {
		quantity5.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity6() {
		quantity6.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity7() {
		quantity7.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity8() {
		quantity8.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity9() {
		quantity9.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity10() {
		quantity10.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity11() {
		quantity11.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity12() {
		quantity12.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity13() {
		quantity13.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity14() {
		quantity14.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity15() {
		quantity15.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity16() {
		quantity16.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity17() {
		quantity17.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity18() {
		quantity18.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity19() {
		quantity19.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest enterquantity20() {
		quantity20.sendKeys("1");
		return this;
		}
	public CreatePartsReturnRequest clickOnSubmitInquiry() {
		SubmitInquiry.click();
		return this;
		}
	public CreatePartsReturnRequest Selectdealer(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByVisibleText(sOption);
		return this;
		}
	public CreatePartsReturnRequest clickOntransmitpartsreturnbutton() {
		transmitpartsreturn.click();
		return this;
		}
	public CreatePartsReturnRequest clickOnResetButton() {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", resetButton);
		return this;
		}
	//Method calls all methods to perform necessary actions
}
