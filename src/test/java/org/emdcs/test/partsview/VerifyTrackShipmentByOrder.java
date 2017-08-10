package org.emdcs.test.partsview;

import org.emdcs.partsview.pageobject.PartsviewmenuPOM;
import org.emdcs.test.utility.Log1;
import org.testng.annotations.Test;

import core.Launchbrowser;

public class VerifyTrackShipmentByOrder extends Launchbrowser{

	

	@Test()
	public void trackShipmentByOrder() throws Exception {
		test = extent.createTest("VerifyTrackShipmentByOrder",
				"This test case will check the trackShipmentByOrder");
		Log1.info("=======Starting trackShipmentByOrder test========");
		// partsviewmenu.todaySalesOrders();
		PartsviewmenuPOM partsviewmenu = new PartsviewmenuPOM(driver);
		partsviewmenu.Selectdealer("61460");
		Log1.info(   "Select the Dealer Number");
		partsviewmenu.clickPartsViewMenu();
		Log1.info(   "Click on Parts View Menu");
		partsviewmenu.clickTrackShipmentByOrder();
		Log1.info(   "Click on Track Shipment By Order");

		partsviewmenu.clickEnterSalesOrderForTrackShipment();
		Log1.info(   "Enter the Sales Order for track Shipment");
		// this is generic sbmit button methods
		partsviewmenu.clickpartNumberSubmit();
		Log1.info(  
				"click on Track Shipment By Order submit button");

		// Get Parent window handle
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			// Switch to child window
			driver.switchTo().window(winHandle);
		}
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Log1.info( "Track Shipment By Order view successfully");
		Log1.info("=======Finished Track Shipment By Order view test========");
	}

}
