package org.emdcs.partsreturns.module;

import java.io.IOException;

import org.emdcs.partsreturns.pageobject.CreatePartsReturnRequest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;

public class CreatePartsReturnRequestModule extends Launchbrowser{
public void  partsReturnsRequest(WebDriver driver) throws IOException, Exception, InterruptedException{
	CreatePartsReturnRequest parts_rtrn = new CreatePartsReturnRequest(driver);
	    parts_rtrn.clickPartsReturnsMenu();
		test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
		Reporter.log("Parts Orderd menu Clicked ");
		parts_rtrn.Selectdealer("61511");
		test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
		Reporter.log("Dealer selected ");
		parts_rtrn.createPartsReturnRequestLink();
		test.log(Status.INFO,MarkupHelper.createLabel("SSOOrderLink Clicked",ExtentColor.BLUE));
		Reporter.log("SSOOrderLink Clicked ");
		parts_rtrn.enterPartsNumber1();
		test.log(Status.INFO,MarkupHelper.createLabel("Parts number entered",ExtentColor.BLUE));
		Reporter.log("Parts number entered ");
		parts_rtrn.enterquantity1();
		test.log(Status.INFO,MarkupHelper.createLabel("quantity  entered",ExtentColor.BLUE));
		Reporter.log("quantity  entered ");
		parts_rtrn.enterTab1();
		test.log(Status.INFO,MarkupHelper.createLabel("Tab Clicked",ExtentColor.BLUE));
		Reporter.log("Tab Clicked ");
		Thread.sleep(2000);
		parts_rtrn.enterComment1();
		test.log(Status.INFO,MarkupHelper.createLabel("Comments  entered ",ExtentColor.BLUE));
		Reporter.log("Comments  entered ");
		parts_rtrn.clickOntransmitpartsreturnbutton();
		test.log(Status.INFO,MarkupHelper.createLabel("Order button clicked ",ExtentColor.BLUE));
		Reporter.log("Order button clicked ");
		 Thread.sleep(5000);
		}
}
