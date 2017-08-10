package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.DMS_CSO_Ordering;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;
public class DMSCSOModule extends Launchbrowser {
public void  CSOPartsOrdering(WebDriver driver) throws IOException, Exception, InterruptedException{
	DMS_CSO_Ordering dmscso_module = new DMS_CSO_Ordering(driver);
	dmscso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	dmscso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	dmscso_module.clickdmsfiletrasfer();
	Log1.info("clicked on dmsfiletrasfer Link");
	test.log(Status.INFO,MarkupHelper.createLabel("clicked on dmsfiletrasfer Link",ExtentColor.BLUE));
		 WebElement upload=driver.findElement(By.name("partsOrderDTO.dmsfile"));
		 Log1.info("clicked on Upload button");
		 test.log(Status.INFO,MarkupHelper.createLabel("clicked on Upload button",ExtentColor.BLUE));
		 upload.sendKeys(Constant.pathCSOFil1);
		 Log1.info("Upload the CSO File");
		 test.log(Status.INFO,MarkupHelper.createLabel("Upload the CSO File",ExtentColor.BLUE));
		 dmscso_module.clicorderbutton();
		 Log1.info("Order button clicked");
		 test.log(Status.INFO,MarkupHelper.createLabel("Order button clicked ",ExtentColor.BLUE));
		 Thread.sleep(5000);
		}

public void DMSCSOPartsView(WebDriver driver) throws IOException, Exception, InterruptedException{
	DMS_CSO_Ordering dmscso_module = new DMS_CSO_Ordering(driver);
	dmscso_module.clickpartsordermenu();
	 Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Thread.sleep(5000);
	dmscso_module.Selectdealer(Constant.dealer);
	 Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	dmscso_module.clickdmsfiletrasfer();
	Log1.info("clicked on dmsfiletrasfer Link");
	test.log(Status.INFO,MarkupHelper.createLabel("clicked on dmsfiletrasfer Link",ExtentColor.BLUE));
	 WebElement upload=driver.findElement(By.name("partsOrderDTO.dmsfile"));
	 Log1.info("clicked on Upload button");
	 test.log(Status.INFO,MarkupHelper.createLabel("clicked on Upload button",ExtentColor.BLUE));
	 upload.sendKeys(Constant.pathCSOFil2);
	 Log1.info("Upload the CSO File");
	 test.log(Status.INFO,MarkupHelper.createLabel("Upload the CSO File",ExtentColor.BLUE));
	 dmscso_module.clicrevieworder();
	 Log1.info("Review button clicked");
	 test.log(Status.INFO,MarkupHelper.createLabel("Review button clicked",ExtentColor.BLUE));
	// clicorderbutton();
	 Thread.sleep(5000);
	}
public void DMSCSOPartsViewWithMoreThanMaxOrderlines(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	DMS_CSO_Ordering dmscso_module = new DMS_CSO_Ordering(driver);
	dmscso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Thread.sleep(5000);
	dmscso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	dmscso_module.clickdmsfiletrasfer();
	Log1.info("clicked on dmsfiletrasfer Link");
	test.log(Status.INFO,MarkupHelper.createLabel("clicked on dmsfiletrasfer Link",ExtentColor.BLUE));
	WebElement upload=driver.findElement(By.name("partsOrderDTO.dmsfile"));
	Log1.info("clicked on Upload button");
	test.log(Status.INFO,MarkupHelper.createLabel("clicked on Upload button",ExtentColor.BLUE));
	 upload.sendKeys(Constant.pathCSOFil3);
	 Log1.info("Upload the CSO File");
	 test.log(Status.INFO,MarkupHelper.createLabel("Upload the CSO File",ExtentColor.BLUE));
	 dmscso_module.clicrevieworder();
	 Log1.info("Review button clicked");
	 test.log(Status.INFO,MarkupHelper.createLabel("Review button clicked",ExtentColor.BLUE));
	 //clicorderbutton();
	 Thread.sleep(5000);
	}
public void CSOCancleOrder(WebDriver driver) throws IOException, Exception, InterruptedException{
	
	DMS_CSO_Ordering dmscso_module = new DMS_CSO_Ordering(driver);
	dmscso_module.clickpartsordermenu();
	Log1.info("Parts Orderd menu Clicked");
	test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
	Thread.sleep(5000);
	dmscso_module.Selectdealer(Constant.dealer);
	Log1.info("Dealer selected");
	test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
	dmscso_module.clickdmsfiletrasfer();
	Log1.info("clicked on dmsfiletrasfer Link");
	test.log(Status.INFO,MarkupHelper.createLabel("clicked on dmsfiletrasfer Link",ExtentColor.BLUE));
	WebElement upload=driver.findElement(By.name("partsOrderDTO.dmsfile"));
	Log1.info("clicked on Upload button");
	test.log(Status.INFO,MarkupHelper.createLabel("clicked on Upload button",ExtentColor.BLUE));
	 upload.sendKeys(Constant.pathCSOFil2);
	 Log1.info("Upload the CSO File");
	 test.log(Status.INFO,MarkupHelper.createLabel("Upload the CSO File",ExtentColor.BLUE));
	 //clicrevieworder();
	 dmscso_module.clicorderbutton();
	 Log1.info("click order button clicked");
	 test.log(Status.INFO,MarkupHelper.createLabel("click order button clicked",ExtentColor.BLUE));
	 Thread.sleep(5000);
}
}
