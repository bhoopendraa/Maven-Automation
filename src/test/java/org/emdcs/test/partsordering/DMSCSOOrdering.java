package org.emdcs.test.partsordering;

import java.util.Iterator;
import java.util.Set;

import org.emdcs.partsordering.module.DMSCSOModule;
import org.emdcs.partsordering.pageobject.DMS_CSO_Ordering;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.emdcs.test.utility.RW_File;
import org.emdcs.test.utility.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.*;

public class DMSCSOOrdering extends Launchbrowser {
	public static String numberAsString;

	//@Test(priority = 1)
	public void VerifyDMSCSOPartsOrder() throws Exception {
		test = extent.createTest("DMSCSOOrdering: VerifyDMSCSOPartsOrder",
				"This test case will check the CSO  Parts Order");
		Log1.info("=======Starting VerifyDMSCSOPartsOrder test========");
		DMSCSOModule data1 = new DMSCSOModule();
		data1.CSOPartsOrdering(driver);
		TestBase.switchTochildWindow(driver);
		String orderNumber = RW_File.readData("seqNumber");
		driver.findElement(By.name("partsOrderDTO.orderNumber")).clear();
		Thread.sleep(2000);
		System.out.println("SSO_orderNumber :" + orderNumber);
		driver.findElement(
				By.xpath("html/body/form/table/tbody/tr[2]/td[4]/input"))
				.sendKeys(Constant.CSO_orderNumber + orderNumber);
		int newNumber = RW_File.generateNumber(orderNumber);
		String actual_CSOOrdernumber = Constant.CSO_orderNumber + orderNumber;
		System.out.println("Order Number Is : " + actual_CSOOrdernumber);
		numberAsString = Integer.toString(newNumber);
		RW_File.updateData("seqNumber", numberAsString);
		System.out.println(numberAsString);
		driver.findElement(By.name("submitOrderbutton")).click();
		Thread.sleep(15000);
		TestBase.switchTochildWindow2(driver);
		String Expected_CSOOredrNumber = driver.findElement(
				By.xpath("html/body/form/table[2]/tbody/tr[1]/td[4]"))
				.getText();
		System.out.println("Expected Order Number Is : "
				+ Expected_CSOOredrNumber);
		Log1.info("=======Finished VerifyDMSCSOPartsOrder test========");
		Assert.assertEquals(actual_CSOOrdernumber, Expected_CSOOredrNumber);
	}

	// @Test(priority=2)
	public void DMSCSOPartsView() throws Exception {
		test = extent.createTest("DMSCSOPartsView",
				"This test case will check the CSO  Parts Order");
		Log1.info("=======Starting DMSCSOPartsView test========");
		DMSCSOModule data1 = new DMSCSOModule();
		data1.DMSCSOPartsView(driver);
		Boolean b = driver.findElement(
				By.xpath(".//*[@id='BottomNextMenu']/input[2]")).isDisplayed();
		Log1.info("=======Finished DMSCSOPartsView test========");
		Assert.assertTrue(b);
		Thread.sleep(5000);

	}

	// @Test(priority=3)
	public void VerifyDMSCSOPartsViewWithMoreThanMaxOrderLines() throws Exception {
		test = extent.createTest(
				"VerifyDMSCSOPartsViewWithMoreThanMaxOrderLines",
				"This test case will check the CSO  Parts Order");
		Log1.info("=======Starting VerifyDMSCSOPartsViewWithMoreThanMaxOrderLines test========");
		DMSCSOModule data1 = new DMSCSOModule();
		data1.DMSCSOPartsViewWithMoreThanMaxOrderlines(driver);
		String Expected_Msg = "Your CSO DMS exceeds the 100 lines allowed by the system. Please correct and resubmitt.";
		String Actual_Msg = driver.findElement(
				By.xpath("html/body/form/table[2]/tbody/tr[11]/td/font/b"))
				.getText();
		System.out.println(Actual_Msg);
		Log1.info("=======Finished VerifyDMSCSOPartsViewWithMoreThanMaxOrderLines test========");
		Assert.assertEquals(Actual_Msg, Expected_Msg);
		Thread.sleep(5000);

	}

	 @Test(priority=4)
	public void VerifyDMSCSOCancleOrder() throws Exception {
		test = extent.createTest("VerifyDMSCSOCancleOrder",
				"This test case will check the CSO  Parts Order");
		Log1.info("=======Starting VerifyDMSCSOCancleOrder test========");
		DMSCSOModule data1 = new DMSCSOModule();
		data1.CSOCancleOrder(driver);
		String Parent_Window = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> li = s1.iterator();
		while (li.hasNext()) {
			String child_window = li.next();
			if (!Parent_Window.equalsIgnoreCase(child_window))
				driver.switchTo().window(child_window);	
		}
		driver.findElement(By.name("cancelOrder")).click();
		Thread.sleep(5000);
		driver.switchTo().window(Parent_Window);
		Log1.info("=======Finished VerifyDMSSSOCancleOrder test========");
		Assert.assertEquals(driver.getTitle(), "DMS Browsing");
		Thread.sleep(5000);
	}
}
