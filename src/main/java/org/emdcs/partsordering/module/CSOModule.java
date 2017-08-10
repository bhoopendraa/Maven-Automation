package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.CSO_Ordering;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;

public class CSOModule extends Launchbrowser {
public void  CSOPartsOrdering(WebDriver driver) throws IOException, Exception, InterruptedException{
	CSO_Ordering cso_module = new CSO_Ordering(driver);
	    cso_module.clickpartsordermenu();
	    Log1.info("Parts Orderd menu Clicked");
	    test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
		Reporter.log("Parts Orderd menu Clicked ");
		cso_module.Selectdealer(Constant.dealer);
		Log1.info("Dealer selected");
		test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
		Reporter.log("Dealer selected ");
		cso_module.csoOrderlink();
		Log1.info("CSOOrderLink Clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("CSOOrderLink Clicked",ExtentColor.BLUE));
		Reporter.log("CSOOrderLink Clicked ");
		cso_module.enterPartsNumber1(Constant.PartsNo1);
		Log1.info("Parts number entered");
		test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
		Reporter.log("Parts number entered ");
		cso_module.enterquantity1();
		Log1.info("quantity  entered");
		test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
		Reporter.log("quantity  entered ");
		cso_module.enterTab1();
		Log1.info("Tab Clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
		Reporter.log("Tab Clicked ");
		Thread.sleep(2000);
		cso_module.enterComment1();
		Log1.info("Comments  entered");
		test.log(Status.INFO,MarkupHelper.createLabel("Comments  entered",ExtentColor.BLUE));
		Reporter.log("Comments  entered ");
		cso_module.clickOnOrderButton();
		Log1.info("Order button clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Order button clicked",ExtentColor.BLUE));
		Reporter.log("Order button clicked ");
		 Thread.sleep(5000);
		}

public void CSOPartsInquiry(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	CSO_Ordering cso_module = new CSO_Ordering(driver);
	//Reporter.log("click on order Menu");
	cso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Reporter.log("Parts Orderd menu Clicked ");
	cso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	cso_module.csoOrderlink();
	Log1.info("CSOOrderLink Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("CSOOrderLink Clicked",ExtentColor.BLUE));
	Reporter.log("CSOOrderLink Clicked ");
	cso_module.enterPartsNumber1(Constant.PartsNo1);
	Log1.info("Parts number entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
	Reporter.log("Parts number entered ");
	cso_module.enterquantity1();
	Log1.info("quantity  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
	Reporter.log("quantity  entered ");
	cso_module.enterTab1();
	Log1.info("Tab Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
	Reporter.log("Tab Clicked ");
	Thread.sleep(2000);
	cso_module.enterComment1();
	Log1.info("Comments  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Comments  entered",ExtentColor.BLUE));
	Reporter.log("Comments  entered ");
	 cso_module.clickOnSubmitInquiry();
	 Log1.info("Inquery button clicked");
	 test.log(Status.INFO,MarkupHelper.createLabel("Inquery button clicked",ExtentColor.BLUE));
	Reporter.log("Inquery button clicked ");
	 Thread.sleep(5000);
	}
public void CSOPartsReset(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	CSO_Ordering cso_module = new CSO_Ordering(driver);
	//Reporter.log("click on order Menu");
	cso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Reporter.log("Parts Orderd menu Clicked ");
	cso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	cso_module.csoOrderlink();
	Log1.info("CSOOrderLink Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("CSOOrderLink Clicked",ExtentColor.BLUE));
	Reporter.log("CSOOrderLink Clicked ");
	cso_module.enterPartsNumber1(Constant.PartsNo1);
	Log1.info("Parts number entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
	Reporter.log("Parts number entered ");
	cso_module.enterquantity1();
	Log1.info("quantity  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
	Reporter.log("quantity  entered ");
	cso_module.enterTab1();
	Log1.info("Tab Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
	Reporter.log("Tab Clicked ");
	Thread.sleep(2000);
	/*cso_module.enterComment1();
	Reporter.log("Comments  entered ");*/
	String Actual_typetext=driver.findElement(By.id("PART1")).getAttribute("value");
	System.out.println("Value of test field is :"+Actual_typetext);
	Thread.sleep(2000);
	cso_module.clickOnResetButton();
	Log1.info("Reset Button Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Reset Button Clicked",ExtentColor.BLUE));
	Reporter.log("Reset Button Clicked");
	 Thread.sleep(5000);
	}
public void CSOAddAdditionalParts(WebDriver driver) throws IOException, Exception, InterruptedException{
	

	CSO_Ordering cso_module = new CSO_Ordering(driver);
	//Reporter.log("click on order Menu");
	cso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Reporter.log("Parts Orderd menu Clicked ");
	cso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	cso_module.csoOrderlink();
	Log1.info("CSOOrderLink Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("CSOOrderLink Clicked",ExtentColor.BLUE));
	Reporter.log("CSOOrderLink Clicked ");
	cso_module.enterPartsNumber1(Constant.PartsNo1);
	Log1.info("Parts number entered");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
	Reporter.log("Parts number entered ");
	cso_module.enterquantity1();
	Log1.info("quantity  entered");
	test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
	Reporter.log("quantity  entered ");
	cso_module.enterTab1();
	cso_module.enterPartsNumber2();
	cso_module.enterquantity2();
	cso_module.enterPartsNumber3();
	cso_module.enterquantity3();
	cso_module.enterPartsNumber4();
	cso_module.enterquantity4();
	cso_module.enterPartsNumber5();
	cso_module.enterquantity5();
	cso_module.enterPartsNumber6();
	cso_module.enterquantity6();
	
	cso_module.enterPartsNumber7();
	cso_module.enterquantity7();
	cso_module.enterPartsNumber8();
	cso_module.enterquantity8();
	cso_module.enterPartsNumber9();
	cso_module.enterquantity9();
	cso_module.enterPartsNumber10();
	cso_module.enterquantity10();
	cso_module.enterPartsNumber11();
	cso_module.enterquantity11();
	
	cso_module.enterPartsNumber12();
	cso_module.enterquantity12();
	cso_module.enterPartsNumber13();
	cso_module.enterquantity13();
	cso_module.enterPartsNumber14();
	cso_module.enterquantity14();
	cso_module.enterPartsNumber15();
	cso_module.enterquantity15();
	cso_module.enterPartsNumber16();
	cso_module.enterquantity16();
	
	cso_module.enterPartsNumber17();
	cso_module.enterquantity17();
	cso_module.enterPartsNumber18();
	cso_module.enterquantity18();
	cso_module.enterPartsNumber19();
	cso_module.enterquantity19();
	cso_module.enterPartsNumber20();
	cso_module.enterquantity20();
	Thread.sleep(2000);
	cso_module.enterComment1();
	Thread.sleep(2000);
	//enterComment1();
	//clickOnResetButton();
	 //Thread.sleep(5000);
	}
}
