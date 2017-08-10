package org.emdcs.test.partsview;

import org.emdcs.partsview.pageobject.PartsviewmenuPOM;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import core.Launchbrowser;

public class VerifytrackShipmentByDate extends Launchbrowser{
	
	@Test()
		public void trackShipmentByDate() throws InterruptedException {
			test = extent.createTest("VerifytrackShipmentByDate",
					"This test case will check the trackShipmentByDate");
			Log1.info("=======Starting trackShipmentByDate test========");
			PartsviewmenuPOM partsviewmenu = new PartsviewmenuPOM(driver);
			partsviewmenu.Selectdealer("61460");
			Log1.info(   "Select the Dealer Number");
			partsviewmenu.clickPartsViewMenu();
			Log1.info(   "Click on Parts View Menu");
			partsviewmenu.clickTrackShipmentByDate();
			Log1.info(   "Click on Track Shipment By Date ");
			String beginngDate = partsviewmenu.beginningDate();
			driver.findElement(
					By.xpath("//html/body/div[4]/form/table/tbody/tr[2]/td[3]/div/font/select"))
					.sendKeys(beginngDate);

			Log1.info(   "Select the Beginnig Date");
			Log1.info(   "Select the Ending Date");
			partsviewmenu.clickSubmit();
			Log1.info(   "Click the Submit Button");
			// Get Parent window handle
			String winHandleBefore = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				// Switch to child window
				driver.switchTo().window(winHandle);
			}
			// Do some operation on child window and get child window handle.
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			Log1.info( "Track Shipment By Date view successfully");
			Log1.info("=======Finished Track Shipment By Date view test========");
		}


}
