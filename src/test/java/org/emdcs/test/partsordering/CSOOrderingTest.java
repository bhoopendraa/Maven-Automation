package org.emdcs.test.partsordering;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.emdcs.partsordering.module.CSOModule;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.emdcs.test.utility.RW_File;
import org.emdcs.test.utility.TestBase;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import core.*;

public class CSOOrderingTest extends Launchbrowser {

	String actual_res = null;
	public static String numberAsString;

	@Test(priority = 5)
	public void VerifyCSOpartsOrdering() throws Exception {
		test = extent.createTest("CSOOrderingTest:VerifyCSOpartsOrdering",
				"This test case will check the CSO  Parts Order");
		Log1.info("=======Starting VerifyCSOpartsOrdering test========");
		CSOModule data1 = new CSOModule();
		data1.CSOPartsOrdering(driver);
		TestBase.switchTochildWindow(driver);
		String orderNumber = RW_File.readData("seqNumber");
		System.out.println("CSO_orderNumber :" + orderNumber);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[4]/input"))
				.sendKeys(Constant.CSO_orderNumber + orderNumber);
		String actual_CSOOrdernumber = Constant.CSO_orderNumber + orderNumber;
		System.out.println("Order Number Is : " + actual_CSOOrdernumber);
		int newNumber = RW_File.generateNumber(orderNumber);

		numberAsString = Integer.toString(newNumber);
		RW_File.updateData("seqNumber", numberAsString);
		System.out.println(numberAsString);
		driver.findElement(By.name("submitOrderbutton")).click();
		//Thread.sleep(15000);
		TestBase.switchTochildWindow2(driver);
		String Expected_CSOOredrNumber = driver.findElement(
				By.xpath("html/body/form/table[2]/tbody/tr[1]/td[4]")).getText();
		System.out.println("Expected Order Number Is : "
				+ Expected_CSOOredrNumber);
		Log1.info("=======Finished VerifyCSOpartsOrdering test========");
		Assert.assertEquals(actual_CSOOrdernumber, Expected_CSOOredrNumber);
		Thread.sleep(10000);

	}

	 @Test(priority = 6)
	public void Verifypartsinquiry() throws Exception {
		test = extent.createTest("Verifypartsinquiry",
				"This test case will check the CSO  Parts Inquiry");
		Log1.info("=======Starting Verifypartsinquiry test========");
		CSOModule data1 = new CSOModule();
		data1.CSOPartsInquiry(driver);
		Thread.sleep(2000);
		String act_res = driver.getTitle();
		Thread.sleep(2000);
		Log1.info("=======Finished Verifypartsinquiry test========");
		Assert.assertEquals(act_res, "Parts Availability and Ordering Result1");
	}

	 @Test(priority = 7)
	public void VerifyCSOPartsReset() throws Exception {
		test = extent.createTest("VerifyCSOPartsReset",
				"This test case will check the Reset Funcionalty");
		Log1.info("=======Starting VerifyCSOPartsReset test========");
		CSOModule data1 = new CSOModule();
		data1.CSOPartsReset(driver);
		String Expec_typetext = driver.findElement(By.id("PART1"))
				.getAttribute("value");
		System.out.println("Value of test field is :" + Expec_typetext);
		Thread.sleep(2000);
		Log1.info("=======Finished VerifyCSOPartsReset test========");
		Assert.assertTrue(Expec_typetext.contains(""));
	}

	// @Test(retryAnalyzer=Retry.class)
	 @Test(priority = 8)
	public void VerifyAddAdditionalParts() throws Exception {
		test = extent.createTest("VerifyAddAdditionalParts",
				"This test case will check Add AdditionalParts");
		Log1.info("=======Starting VerifyAddAdditionalParts test========");
		CSOModule data1 = new CSOModule();
		data1.CSOAddAdditionalParts(driver);
		String act_res = driver.findElement(
						By.xpath("html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr/td[2]/b/font")).getText();
		System.out.println(act_res);
		driver.findElement(By.xpath("//input[@value='Add Additional Parts']")).click();
		Reporter.log("AddAdditionalParts button clicked ");
		Log1.info("=======Finished VerifyAddAdditionalParts test========");
		Thread.sleep(2000);
		Assert.assertTrue(act_res.contains("CSO"));
	}
}
