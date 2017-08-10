package org.emdcs.test.partsview;

import java.util.List;

import org.emdcs.partsview.pageobject.PartsviewmenuPOM;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import core.Launchbrowser;

public class VerifyViewSalesOrdersByOrderType extends Launchbrowser {
	
	@Test()
		public void byOrderType() throws InterruptedException {
			test = extent.createTest("VerifyViewSalesOrdersByOrderType",
					"This test case will check the byOrderType");
			Log1.info("=======Starting VerifyCSOpartsOrdering test========");
			PartsviewmenuPOM partsviewmenu = new PartsviewmenuPOM(driver);
			partsviewmenu.Selectdealer("61460");
			Log1.info( "Select the Dealer Number");
			partsviewmenu.clickPartsViewMenu();
			Log1.info("Click on Parts View Menu");
			partsviewmenu.clickSalesOrdersByOrderType();
			Log1.info("Click on SalesOrdersByOrderType ");
			partsviewmenu.clickSelectOrderType("CSO");
			Log1.info("Slect the Order Type ");
			partsviewmenu.clickSalesOrderStatus("All");
			Log1.info("Select the Sales Order Status");
			String beginngDate = partsviewmenu.beginningDate();
			System.out.print(beginngDate);
			driver.findElement(
					By.xpath("/html/body/div[4]/form/table/tbody/tr[3]/td[3]/div/font/select"))
					.sendKeys(beginngDate);
			Log1.info("Select the Beginnig Date");

			partsviewmenu.clickSubmit();
			Log1.info( "Click the Submit Button");
			// Get Parent window handle
			String winHandleBefore = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				// Switch to child window
				driver.switchTo().window(winHandle);
			}
			// Do some operation on child window and get child window handle.
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			List<WebElement> mytablerow = driver.findElements(By
					.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr"));
			Log1.info("Found total number of rows");
			int rows_count = mytablerow.size();
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
				// For view shipment through clicking on part link
				// String collink="/div/font/a";

				// For view shipment through clicking on viewshipment link
				String viewship = "/font/a";
				// row1=2, here are click multiple time (click multiple row)
				// int row1 = 2;
				for (int row = 1; row <= rows_count; row++) {
					for (int col = 1; col <= colSize; col++) {
						// String final_xpath =
						// first_part+row+second_part+col+third_part;

						// row1=2, here are click only one time (click only for one
						// row)
						int row1 = 2;
						if (row == row1 && col == 7) {
							String colpath = first_part + row + second_part + col
									+ third_part + viewship;
							driver.findElement(By.xpath(colpath)).click();
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
							Thread.sleep(1000);

							driver.close();
							driver.switchTo().window(winHandleAfter);
						}
					}
				}

			} else {
				System.out
						.println("No data was found base on your request parameters.");
				Log1.info(
						"No data was found base on your request parameters.");
			}
			Thread.sleep(1000);
			driver.close();
			driver.switchTo().window(winHandleBefore);
			Log1.info( "SalesOrdersByOrderType view successfully");
			Log1.info("=======Finished byOrderType view test========");
		}


}
