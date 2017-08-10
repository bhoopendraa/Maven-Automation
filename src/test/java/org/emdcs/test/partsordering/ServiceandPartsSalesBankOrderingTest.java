package org.emdcs.test.partsordering;
import junit.framework.Assert;

import org.emdcs.partsordering.module.ServiceAndPartsSalesBankModule;
import org.emdcs.test.utility.Constant;
import org.emdcs.test.utility.Log1;
import org.emdcs.test.utility.RW_File;
import org.emdcs.test.utility.TestBase;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import core.*;

public class ServiceandPartsSalesBankOrderingTest extends Launchbrowser {
	String actual_res = null;
	public static String numberAsString;

	@Test(priority = 1)
	public void VerifyServiceandPartsSalesBankOrder() throws Exception {
		test = extent.createTest("VerifyServiceandPartsSalesBankOrder",
				"This test case will check the Sales Bank Parts Order");
		Log1.info("=======Starting VerifyServiceandPartsSalesBankOrder test========");
		ServiceAndPartsSalesBankModule data1 = new ServiceAndPartsSalesBankModule();
		data1.ServiceandpartSalesBankOrder(driver);
		TestBase.switchTochildWindow(driver);
		String orderNumber = RW_File.readData("seqNumber");
		System.out.println("SalesBank_orderNumber :" + orderNumber);
		driver.findElement(
				By.xpath("html/body/form/table/tbody/tr[2]/td[4]/input"))
				.sendKeys(Constant.SalesBank_orderNumber + orderNumber);
		String actual_SalesBank_orderNumber = Constant.SalesBank_orderNumber
				+ orderNumber;
		System.out.println("Order Number Is : " + actual_SalesBank_orderNumber);
		int newNumber = RW_File.generateNumber(orderNumber);
		numberAsString = Integer.toString(newNumber);
		RW_File.updateData("seqNumber", numberAsString);
		System.out.println(numberAsString);
		driver.findElement(By.name("submitOrderbutton")).click();
		Thread.sleep(15000);
		TestBase.switchTochildWindow2(driver);
		String Expected_SalesBank_orderNumber = driver
				.findElement(
						By.xpath("html/body/form/table[2]/tbody/tr/td/table/tbody/tr[2]/td/font[2]/b"))
				.getText();
		System.out.println("Expected Order Number Is : "
				+ Expected_SalesBank_orderNumber);
		Log1.info("=======Finished VerifyServiceandPartsSalesBankOrder test========");
		Assert.assertEquals(actual_SalesBank_orderNumber,
				Expected_SalesBank_orderNumber);
		Reporter.log("Parts Ordered Successfully and Parts Order Number is"
				+ Expected_SalesBank_orderNumber);
		Thread.sleep(10000);

	}
}
