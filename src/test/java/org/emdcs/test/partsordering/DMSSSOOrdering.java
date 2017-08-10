package org.emdcs.test.partsordering;

import java.util.Iterator;
import java.util.Set;

import org.emdcs.partsordering.module.DMSSSOModule;
import org.emdcs.partsordering.pageobject.DMS_SSO_Ordering;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.emdcs.test.utility.RW_File;
import org.emdcs.test.utility.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import core.*;

public class DMSSSOOrdering extends Launchbrowser {
	public static String numberAsString;

	@Test(priority = 1)
	public void VerifyDMSSSOOrdering() throws Exception {
		test = extent.createTest("DMSSSOOrdering:VerifyDMSSSOOrdering",
				"This test case will check the SSO  Parts Order");
		Log1.info("=======Starting VerifyDMSSSOOrdering test========");
		DMSSSOModule data1 = new DMSSSOModule();
		data1.SSOPartsOrdering(driver);
		TestBase.switchTochildWindow(driver);
		String orderNumber = RW_File.readData("seqNumber");
		driver.findElement(By.name("partsOrderDTO.orderNumber")).clear();
		Thread.sleep(2000);
		System.out.println("SSO_orderNumber :" + orderNumber);
		driver.findElement(
				By.xpath("html/body/form/table/tbody/tr[2]/td[4]/input"))
				.sendKeys(Constant.SSO_orderNumber + orderNumber);
		String actual_SSOOrdernumber = Constant.SSO_orderNumber + orderNumber;
		System.out.println("Order Number Is : " + actual_SSOOrdernumber);
		int newNumber = RW_File.generateNumber(orderNumber);

		numberAsString = Integer.toString(newNumber);
		RW_File.updateData("seqNumber", numberAsString);
		System.out.println(numberAsString);
		driver.findElement(By.name("submitOrderbutton")).click();
		Thread.sleep(10000);
		TestBase.switchTochildWindow2(driver);
		String Expected_SSOOredrNumber = driver
				.findElement(
						By.xpath("html/body/form/table[2]/tbody/tr/td/table/tbody/tr[2]/td/font[2]/b"))
				.getText();
		System.out.println("Expected Order Number Is : "
				+ Expected_SSOOredrNumber);
		Log1.info("=======Finished VerifyDMSSSOOrdering test========");
		Assert.assertEquals(actual_SSOOrdernumber, Expected_SSOOredrNumber);
	}

	@Test(priority=2)
	public void DMSSSOPartsView() throws Exception {
		test = extent.createTest("DMSSSOPartsView",
				"This test case will check the SSO  Parts Order");
		Log1.info("=======Starting DMSSSOPartsView test========");
		DMSSSOModule data1 = new DMSSSOModule();
		data1.DMSSSOPartsView(driver);
		Boolean b = driver
				.findElement(
						By.xpath(".//*[@id='BottomNextMenu']/table/tbody/tr/td[2]/input"))
				.isDisplayed();
		Log1.info("=======Finished DMSSSOPartsView test========");
		Assert.assertTrue(b);
		Thread.sleep(10000);
	}

	 @Test(priority=3)
	public void VerifySSOPartsViewWithMoreThanMaxOrderLines() throws Exception {
		test = extent.createTest(
				"Verify_SSOPartsViewWithMoreThanMaxOrderLines",
				"This test case will check the SSO  Parts Order");
		Log1.info("=======Starting VerifySSOPartsViewWithMoreThanMaxOrderLines test========");
		DMSSSOModule data1 = new DMSSSOModule();
		data1.DMSSSOPartsViewWithMoreThanMaxOrderlines(driver);

		String Expected_Msg = "Your CSO DMS exceeds the 100 lines allowed by the system. Please correct and resubmit.";
		String Actual_Msg = driver.findElement(
				By.xpath("html/body/form/table[2]/tbody/tr[11]/td/font/b"))
				.getText();
		System.out.println(Actual_Msg);
		Log1.info("=======Finished VerifySSOPartsViewWithMoreThanMaxOrderLines test========");
		Assert.assertEquals(Actual_Msg, Expected_Msg);
		Thread.sleep(10000);

	}

	 @Test(priority=4)
	public void VerifyDMSSSOCancleOrder() throws Exception {
		test = extent.createTest("VerifyDMSSSOCancleOrder",
				"This test case will check the SSO  Parts Order");
		Log1.info("=======Starting VerifyDMSSSOCancleOrder test========");
		DMSSSOModule data1 = new DMSSSOModule();
		data1.SSOCancleOrder(driver);
		String Parent_Window = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> li = s1.iterator();
		while (li.hasNext()) {
			String child_window = li.next();
			if (!Parent_Window.equalsIgnoreCase(child_window))
				driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("cancelOrder")).click();
		Thread.sleep(5000);
		driver.switchTo().window(Parent_Window);
		Log1.info("=======Finished VerifyDMSSSOCancleOrder test========");
		Assert.assertEquals(driver.getTitle(), "DMS Browsing");
		Thread.sleep(5000);
	}
}
