package org.emdcs.test.partsreturn;
import java.util.List;

import org.emdcs.partsview.pageobject.PartsviewmenuPOM;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import core.*;

public class VerifytodaySalesOrdersDemo extends Launchbrowser {
	
	@Test()
	public void todaySalesOrdersDemo() throws Exception {
		test = extent.createTest("PartsviewmenuTest",
				"This test case will check the today Sales Orders");
		Log1.info("=======Starting todaySalesOrders test========");
		// partsviewmenu.todaySalesOrders();
		PartsviewmenuPOM partsviewmenu = new PartsviewmenuPOM(driver);
		partsviewmenu.Selectdealer("61460");
		Log1.info( "Select the Dealer Number");
		partsviewmenu.clickPartsViewMenu();
		Log1.info( "Click on Parts View Menu");
		partsviewmenu.clickTodaySalesOrder();
		Log1.info("Click on Today Sales Order ");

		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			// Switch to child window
			driver.switchTo().window(winHandle);
		}
		// Do some operation on child window and get child window handle.
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		List<WebElement> mytable = driver.findElements(By
				.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr"));
		Log1.info( "Found total number of rows");
		int rows_count = mytable.size();
		System.out.println(rows_count);
		if (rows_count >= 2) {
			int colSize = driver
					.findElements(
							By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr[2]/td"))
					.size();
			System.out.println(colSize);
			String first_part = "/html/body/table[3]/tbody/tr/td/table/tbody/tr[";
			String second_part = "]/td[";
			String third_part = "]";
			String collink = "/div/font/a";
			// String viewship = "/font/a";
			// int row1 = 2;
			for (int row = 1; row <= rows_count; row++) {

				for (int col = 1; col <= colSize; col++) {
					int row1 = 2;
					if (row == row1 && col == 2) {
						String colpath = first_part + row + second_part + col
								+ third_part + collink;
						driver.findElement(By.xpath(colpath)).click();
						// Log1.info(  
						// "Click on Shipment for specifc row");
						Log1.info(
								"Click on specific Order Number for tracking");
						row1++;
						String winHandleAfter = driver.getWindowHandle();
						for (String winChildHandle : driver.getWindowHandles()) {
							// Switch to child window of the 1st child window.
							if (!winChildHandle.equals(winHandleBefore)
									&& !winChildHandle.equals(winHandleAfter)) {
								driver.switchTo().window(winChildHandle);
								driver.manage().window().maximize();
								System.out.println(driver.getTitle());
							}
						}
						Thread.sleep(2000);
						driver.close();
						driver.switchTo().window(winHandleAfter);
					}

				}
			}
		}

		else {
			System.out
					.println("No data was found base on your request parameters.");
			Log1.info(
					"No data was found base on your request parameters.");
		}
		Thread.sleep(2000);
		/*driver.close();
		driver.switchTo().window(winHandleBefore);*/
		Log1.info("todaySalesOrders view successfully");
		Log1.info("=======Finished todaySalesOrders test========");
	}

	
	
	

	
	
	
	
		// driver.quit()
		// driver.get("D:\\QATool\\Report\\advancedReport.html");
	}

