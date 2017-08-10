package org.emdcs.partsordering.pageobject;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class MazdaSpecialRestrictedPartsOrdering {

	private WebDriver driver;
	public MazdaSpecialRestrictedPartsOrdering(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Webelements of Login Page and Security Question Page
	@FindBy(linkText="Parts Ordering Menu")
	WebElement partsordermenu;
	
	@FindBy(linkText="Special Restricted Parts Ordering - Recall,Service Bulletin")
	WebElement SpecialRestrictedPartsOrdering;
	@FindBy(id="recallNo")
	WebElement selectRecalNo;
	@FindBy(xpath="//input[@value='    Go    ']")
	WebElement goButton;
	@FindBy(name="overRide")
	WebElement OverrideRadioButton;
	@FindBy(xpath="html/body/form/table[4]/tbody/tr[2]/td[1]/input[1]")
	WebElement SubmitInquiry;
	
	
	@FindBy(name="dealerCode")
	WebElement selectdealer;
	@FindBy(xpath="//input[@value='Order Parts']")
	WebElement orderbutton;
	@FindBy(xpath="html/body/form/table[4]/tbody/tr[2]/td[1]/input[3]")
	WebElement resetButton;
	
	 
	
	//Method to type the email id
	public MazdaSpecialRestrictedPartsOrdering clickpartsordermenu() {
		partsordermenu.click();
		return this;
		}
	
	//Method to Type password
	public MazdaSpecialRestrictedPartsOrdering clickOnSpecialRestrictedPartsOrderingLink() {
		SpecialRestrictedPartsOrdering.click();
		return this;
		}
	public MazdaSpecialRestrictedPartsOrdering SelectselectRecalNo(String sOption) {
		Select _sel = new Select(selectRecalNo);
		_sel.selectByValue(sOption);
		return this;
		}
	public MazdaSpecialRestrictedPartsOrdering clickOnSubmitInquiry() {
		SubmitInquiry.click();
		return this;
		}
	public MazdaSpecialRestrictedPartsOrdering clickOnGoButton() {
		goButton.click();
		return this;
		}
	public MazdaSpecialRestrictedPartsOrdering Selectdealer(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByValue(sOption);
		return this;
		}
	/*public MazdaSpecialRestrictedPartsOrdering checkOverrideRadiobutton(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByValue(sOption);
		return this;
		}*/
	public MazdaSpecialRestrictedPartsOrdering clickOnOrderButton() {
		orderbutton.click();
		return this;
		}
	public MazdaSpecialRestrictedPartsOrdering clickOnResetButton() {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", resetButton);
		return this;
		}
	//Method calls all methods to perform necessary actions
	
}
