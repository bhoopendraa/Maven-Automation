package org.emdcs.partsavailability.module;

import java.io.IOException;

import org.emdcs.partsavailability.pageobject.PartsAvailability;
import org.emdcs.partsreturns.pageobject.CreatePartsReturnRequest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;

public class PartsAvailabilityModule extends Launchbrowser{
public void  partsAvailability(WebDriver driver) throws IOException, Exception, InterruptedException{
	PartsAvailability parts_avl = new PartsAvailability(driver);
	parts_avl.Selectdealer("61511");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	Reporter.log("Dealer selected ");
	    parts_avl.clickPartsAvailability();
		test.log(Status.INFO,MarkupHelper.createLabel("Parts Availability Clicked",ExtentColor.BLUE));
		Reporter.log("Parts Availability Clicked");
		parts_avl.enterPartsNumber1();
		test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
		Reporter.log("Parts number entered");
		parts_avl.enterquantity1();
		test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
		Reporter.log("quantity  entered");
		/*parts_avl.enterTab1();
		test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
		Reporter.log("Tab Clicked");*/
		Thread.sleep(2000);
		parts_avl.clickOnPerformStockOrderInquiry();
		test.log(Status.INFO,MarkupHelper.createLabel("Perform Stock Order Inquiry checkbox  clicked ",ExtentColor.BLUE));
		Reporter.log("Perform Stock Order Inquiry checkbox  clicked");
		parts_avl.clickOnSubmit();
		test.log(Status.INFO,MarkupHelper.createLabel("Submit button clicked ",ExtentColor.BLUE));
		Reporter.log("Submit button clicked ");
		 Thread.sleep(5000);
		}
}
