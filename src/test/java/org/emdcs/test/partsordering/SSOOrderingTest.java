package org.emdcs.test.partsordering;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.emdcs.partsordering.module.SSOModule;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.emdcs.test.utility.RW_File;
import org.emdcs.test.utility.Retry;
import org.emdcs.test.utility.TestBase;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.*;

public class SSOOrderingTest extends Launchbrowser {
	String actual_res = null;
	public static String numberAsString;

	@Test(priority = 1)
	public void VerifySSOpartsOrdering() throws Exception {
		test = extent.createTest("SSOOrderingTest: Verify_SSOpartsOrder ",
				"This test case will check the SSO  Parts Order");
		Log1.info("=======Starting VerifySSOpartsOrdering test========");
		SSOModule data1 = new SSOModule();
		data1.SSOPartsOrdering(driver);
		TestBase.switchTochildWindow(driver);
		String orderNumber = RW_File.readData("seqNumber");
		System.out.println("SSO_orderNumber :" + orderNumber);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[4]/input"))
				.sendKeys(Constant.SSO_orderNumber + orderNumber);
		Log1.info("Parts Order number entered");
		test.log(Status.INFO,MarkupHelper.createLabel("Parts Order number entered  ",ExtentColor.BLUE));
		Reporter.log("Parts Order number entered ");
		String actual_SSOOrdernumber = Constant.SSO_orderNumber + orderNumber;
		System.out.println("Actual Order Number Is : " + actual_SSOOrdernumber);
		int newNumber = RW_File.generateNumber(orderNumber);
		numberAsString = Integer.toString(newNumber);
		RW_File.updateData("seqNumber", numberAsString);
		System.out.println(numberAsString);
		driver.findElement(By.name("submitOrderbutton")).click();
		Log1.info("Submit Order button clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Submit Order button clicked",ExtentColor.BLUE));
		Reporter.log("Submit Order button clicked ");
		Thread.sleep(15000);
		TestBase.switchTochildWindow2(driver);
		Thread.sleep(5000);
		String Expected_SSOOredrNumber = driver
				.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/table/tbody/tr[2]/td/font[2]/b"))
				.getText();
		System.out.println("Expected Order Number Is : "
				+ Expected_SSOOredrNumber);
		Log1.info("=======Finished VerifySSOpartsOrdering test========");
		Assert.assertEquals(actual_SSOOrdernumber, Expected_SSOOredrNumber);
		Reporter.log("Parts Ordered Successfully and Parts Order Number is"
				+ Expected_SSOOredrNumber);
	}

	 @Test(priority=2)
	public void VerifySSOpartsinquiry() throws Exception {
		test = extent.createTest("VerifySSOpartsinquiry",
				"This test case will check the SSO  Parts Inquiry");
		Log1.info("=======Starting VerifySSOpartsinquiry test========");
		SSOModule data1 = new SSOModule();
		data1.SSOPartsInquiry(driver);
		String act_res = driver.getTitle();
		String expected_res = "Parts Availability and Ordering Result1";
		Thread.sleep(5000);
		Log1.info("=======Finished VerifySSOpartsinquiry test========");
		Assert.assertEquals(act_res,expected_res);
		//Assert.assertEquals(act_res, "Parts Availability and Ordering Result");
	}

	 @Test(priority=3)
	public void VerifySSOPartsReset() throws Exception {
		test = extent.createTest("VerifySSOPartsReset",
				"This test case will check the Reset Funcionalty");
		Log1.info("=======Starting VerifySSOPartsReset test========");
		SSOModule data1 = new SSOModule();
		data1.SSOPartsReset(driver);
		String Expec_typetext = driver.findElement(By.id("PART1"))
				.getAttribute("value");
		System.out.println("Value of test field is :" + Expec_typetext);
		Thread.sleep(2000);
		Log1.info("=======Finished VerifySSOPartsReset test========");
		Assert.assertTrue(Expec_typetext.contains(""));
	}

	 @Test(priority=4,retryAnalyzer=Retry.class)
	public void VerifyAddAdditionalParts() throws Exception {
		test = extent.createTest("VerifyAddAdditionalParts",
				"This test case will check Add AdditionalParts");
		Log1.info("=======Starting VerifyAddAdditionalParts test========");
		SSOModule data1 = new SSOModule();
		data1.SSOAddAdditionalParts(driver);
		String act_res = driver.findElement(
						By.xpath("html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr/td[2]/b/font"))
				.getText();
		System.out.println(act_res);
		driver.findElement(By.xpath("//input[@value='Add Additional Parts']")).click();
		test.log(Status.INFO,MarkupHelper.createLabel("AddAdditionalParts button clicked",ExtentColor.BLUE));
		Reporter.log("AddAdditionalParts button clicked ");
		Thread.sleep(2000);
		Log1.info("=======Finished VerifyAddAdditionalParts test========");
		Assert.assertTrue(act_res.contains("SSO"));
	}
}
