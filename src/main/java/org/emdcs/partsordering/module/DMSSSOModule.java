package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.DMS_SSO_Ordering;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;
import dataobject.SSO_Orderingdata;

public class DMSSSOModule extends Launchbrowser {
	public void SSOPartsOrdering(WebDriver driver) throws IOException,
			Exception, InterruptedException {
		DMS_SSO_Ordering dmssso_module = new DMS_SSO_Ordering(driver);
		dmssso_module.clickpartsordermenu();
		Log1.info("Parts Orderd menu Clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Parts Orderd menu Clicked", ExtentColor.BLUE));
		dmssso_module.Selectdealer(Constant.dealer);
		Log1.info("Dealer selected");
		test.log(Status.INFO,
				MarkupHelper.createLabel("Dealer selected", ExtentColor.BLUE));
		dmssso_module.clickdmsfiletrasfer();
		Log1.info("clicked on dmsfiletrasfer Link");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on dmsfiletrasfer Link", ExtentColor.BLUE));
		WebElement upload = driver
				.findElement(By.name("partsOrderDTO.dmsfile"));
		Log1.info("clicked on Upload button");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on Upload button", ExtentColor.BLUE));
		upload.sendKeys(Constant.pathSSOFile1);
		Log1.info("Upload the SSO File");
		test.log(Status.INFO, MarkupHelper.createLabel("Upload the SSO File",
				ExtentColor.BLUE));
		// clicrevieworder();
		dmssso_module.clicorderbutton();
		Log1.info("Order button clicked");
		test.log(Status.INFO, MarkupHelper.createLabel("Order button clicked ",
				ExtentColor.BLUE));
		Thread.sleep(5000);
	}

	public void DMSSSOPartsView(WebDriver driver) throws IOException,
			Exception, InterruptedException {
		DMS_SSO_Ordering dmssso_module = new DMS_SSO_Ordering(driver);
		dmssso_module.clickpartsordermenu();
		Log1.info("Parts Orderd menu Clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Parts Orderd menu Clicked", ExtentColor.BLUE));
		Thread.sleep(5000);
		dmssso_module.Selectdealer(Constant.dealer);
		Log1.info("Dealer selected");
		test.log(Status.INFO,
				MarkupHelper.createLabel("Dealer selected", ExtentColor.BLUE));
		dmssso_module.clickdmsfiletrasfer();
		Log1.info("clicked on dmsfiletrasfer Link");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on dmsfiletrasfer Link", ExtentColor.BLUE));
		WebElement upload = driver
				.findElement(By.name("partsOrderDTO.dmsfile"));
		Log1.info("clicked on Upload button");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on Upload button", ExtentColor.BLUE));
		upload.sendKeys(Constant.pathSSOFile1);
		Log1.info("Upload the SSO File");
		test.log(Status.INFO, MarkupHelper.createLabel("Upload the SSO File",
				ExtentColor.BLUE));
		dmssso_module.clicrevieworder();
		Log1.info("Review button clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Review button clicked ", ExtentColor.BLUE));
		// clicorderbutton();
		Thread.sleep(5000);
	}

	public void DMSSSOPartsViewWithMoreThanMaxOrderlines(WebDriver driver)
			throws IOException, Exception, InterruptedException {

		DMS_SSO_Ordering dmssso_module = new DMS_SSO_Ordering(driver);
		dmssso_module.clickpartsordermenu();
		Log1.info("Parts Orderd menu Clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Parts Orderd menu Clicked", ExtentColor.BLUE));
		Thread.sleep(5000);
		dmssso_module.Selectdealer(Constant.dealer);
		Log1.info("Dealer selected");
		test.log(Status.INFO,
				MarkupHelper.createLabel("Dealer selected", ExtentColor.BLUE));
		dmssso_module.clickdmsfiletrasfer();
		Log1.info("clicked on dmsfiletrasfer Link");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on dmsfiletrasfer Link", ExtentColor.BLUE));
		WebElement upload = driver
				.findElement(By.name("partsOrderDTO.dmsfile"));
		Log1.info("clicked on Upload button");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on Upload button", ExtentColor.BLUE));
		upload.sendKeys(Constant.pathSSOFile2);
		Log1.info("Upload the SSO File");
		test.log(Status.INFO, MarkupHelper.createLabel("Upload the SSO File",
				ExtentColor.BLUE));
		dmssso_module.clicrevieworder();
		Log1.info("Review button clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Review button clicked ", ExtentColor.BLUE));
		// clicorderbutton();
		Thread.sleep(5000);
	}

	public void SSOCancleOrder(WebDriver driver) throws IOException, Exception,
			InterruptedException {

		DMS_SSO_Ordering dmssso_module = new DMS_SSO_Ordering(driver);
		dmssso_module.clickpartsordermenu();
		Log1.info("Parts Orderd menu Clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Parts Orderd menu Clicked", ExtentColor.BLUE));
		Thread.sleep(5000);
		dmssso_module.Selectdealer(Constant.dealer);
		Log1.info("Dealer selected");
		test.log(Status.INFO,
				MarkupHelper.createLabel("Dealer selected", ExtentColor.BLUE));
		dmssso_module.clickdmsfiletrasfer();
		Log1.info("clicked on dmsfiletrasfer Link");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on dmsfiletrasfer Link", ExtentColor.BLUE));
		WebElement upload = driver
				.findElement(By.name("partsOrderDTO.dmsfile"));
		Log1.info("clicked on Upload button");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"clicked on Upload button", ExtentColor.BLUE));
		upload.sendKeys(Constant.pathSSOFile3);
		Log1.info("Upload the SSO File");
		test.log(Status.INFO, MarkupHelper.createLabel("Upload the SSO File",
				ExtentColor.BLUE));
		// clicrevieworder();
		dmssso_module.clicorderbutton();
		Log1.info("Cancle button clicked");
		test.log(Status.INFO, MarkupHelper.createLabel(
				"Cancle button clicked ", ExtentColor.BLUE));
		Thread.sleep(5000);
	}
}
