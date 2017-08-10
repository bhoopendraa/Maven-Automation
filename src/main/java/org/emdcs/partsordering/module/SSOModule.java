package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.SSO_Ordering;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;

public class SSOModule extends Launchbrowser{
public void  SSOPartsOrdering(WebDriver driver) throws IOException, Exception, InterruptedException{
		SSO_Ordering sso_module = new SSO_Ordering(driver);
		sso_module.clickpartsordermenu();
		Log1.info("Parts Orderd menu Clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
		Reporter.log("Parts Orderd menu Clicked ");
		sso_module.Selectdealer(Constant.dealer);
		Log1.info("Dealer selected");
		test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
		Reporter.log("Dealer selected ");
		sso_module.ssoOrderlink();
		Log1.info("SSOOrderLink Clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("SSOOrderLink Clicked",ExtentColor.BLUE));
		Reporter.log("SSOOrderLink Clicked ");
		sso_module.enterPartsNumber1(Constant.PartsNo1);
		Log1.info("Parts number entered");
		test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
		Reporter.log("Parts number entered ");
		sso_module.enterquantity1();
		Log1.info("quantity  entered");
		test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
		Reporter.log("quantity  entered ");
		sso_module.enterTab1();
		Log1.info("Tab Clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
		Reporter.log("Tab Clicked ");
		Thread.sleep(2000);
		sso_module.enterComment1();
		Log1.info("Comments  entered");
		test.log(Status.INFO,MarkupHelper.createLabel("Comments  entered ",ExtentColor.BLUE));
		Reporter.log("Comments  entered ");
		sso_module.clickOnOrderButton();
		Log1.info("Order button clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Order button clicked ",ExtentColor.BLUE));
		Reporter.log("Order button clicked ");
		 Thread.sleep(5000);
		}

public void SSOPartsInquiry(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	SSO_Ordering sso_module = new SSO_Ordering(driver);
	//Reporter.log("click on order Menu");
	sso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Reporter.log("Parts Orderd menu Clicked ");
	sso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	sso_module.ssoOrderlink();
	Log1.info("SSOOrderLink Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("SSOOrderLink Clicked",ExtentColor.BLUE));
	Reporter.log("SSOOrderLink Clicked ");
	sso_module.enterPartsNumber1(Constant.PartsNo1);
	Log1.info("Parts number entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
	Reporter.log("Parts number entered ");
	sso_module.enterquantity1();
	Log1.info("quantity  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
	Reporter.log("quantity  entered ");
	sso_module.enterTab1();
	Log1.info("Tab Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
	Reporter.log("Tab Clicked ");
	Thread.sleep(2000);
	sso_module.enterComment1();
	Log1.info("Comments  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Comments  entered ",ExtentColor.BLUE));
	Reporter.log("Comments  entered ");
	sso_module.clickOnSubmitInquiry();
	Log1.info("Inquery button clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Inquery button clicked ",ExtentColor.BLUE));
	Reporter.log("Inquery button clicked ");
	 Thread.sleep(5000);
	}
public void SSOPartsReset(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	SSO_Ordering sso_module = new SSO_Ordering(driver);
	sso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Reporter.log("Parts Orderd menu Clicked ");
	sso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	sso_module.ssoOrderlink();
	Log1.info("SSOOrderLink Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("SSOOrderLink Clicked",ExtentColor.BLUE));
	Reporter.log("SSOOrderLink Clicked ");
	sso_module.enterPartsNumber1(Constant.PartsNo1);
	Log1.info("Parts number entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
	Reporter.log("Parts number entered ");
	sso_module.enterquantity1();
	Log1.info("quantity  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
	Reporter.log("quantity  entered ");
	//enterTab1();
	sso_module.enterComment1();
	Log1.info("Comments  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Comments  entered",ExtentColor.BLUE));
	Reporter.log("Comments  entered ");
	String Actual_typetext=driver.findElement(By.id("PART1")).getAttribute("value");
	System.out.println("Value of test field is :"+Actual_typetext);
	Thread.sleep(2000);
	sso_module.clickOnResetButton();
	Log1.info("Reset Button Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Reset Button Clicked",ExtentColor.BLUE));
	Reporter.log("Reset Button Clicked");
	 Thread.sleep(5000);
	}
public void SSOAddAdditionalParts(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	SSO_Ordering sso_module = new SSO_Ordering(driver);
	//Reporter.log("click on order Menu");
	sso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Reporter.log("Parts Orderd menu Clicked ");
	sso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	sso_module.ssoOrderlink();
	Log1.info("SSOOrderLink Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("SSOOrderLink Clicked",ExtentColor.BLUE));
	Reporter.log("SSOOrderLink Clicked ");
	sso_module.enterPartsNumber1(Constant.PartsNo1);
	Log1.info("Parts number entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
	Reporter.log("Parts number entered ");
	sso_module.enterquantity1();
	Log1.info("quantity  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
	Reporter.log("quantity  entered ");
	sso_module.enterTab1();
	sso_module.enterPartsNumber2();
	sso_module.enterquantity2();
	sso_module.enterPartsNumber3();
	sso_module.enterquantity3();
	sso_module.enterPartsNumber4();
	sso_module.enterquantity4();
	sso_module.enterPartsNumber5();
	sso_module.enterquantity5();
	sso_module.enterPartsNumber6();
	sso_module.enterquantity6();
	
	sso_module.enterPartsNumber7();
	sso_module.enterquantity7();
	sso_module.enterPartsNumber8();
	sso_module.enterquantity8();
	sso_module.enterPartsNumber9();
	sso_module.enterquantity9();
	sso_module.enterPartsNumber10();
	sso_module.enterquantity10();
	sso_module.enterPartsNumber11();
	sso_module.enterquantity11();
	
	sso_module.enterPartsNumber12();
	sso_module.enterquantity12();
	sso_module.enterPartsNumber13();
	sso_module.enterquantity13();
	sso_module.enterPartsNumber14();
	sso_module.enterquantity14();
	sso_module.enterPartsNumber15();
	sso_module.enterquantity15();
	sso_module.enterPartsNumber16();
	sso_module.enterquantity16();
	
	sso_module.enterPartsNumber17();
	sso_module.enterquantity17();
	sso_module.enterPartsNumber18();
	sso_module.enterquantity18();
	sso_module.enterPartsNumber19();
	sso_module.enterquantity19();
	sso_module.enterPartsNumber20();
	sso_module.enterquantity20();
	Thread.sleep(2000);
	//enterComment1();
	//clickOnResetButton();
	 //Thread.sleep(5000);
	}
}
