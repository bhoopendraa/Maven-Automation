package org.emdcs.test.partsview;

import org.emdcs.partsview.pageobject.PartsviewmenuPOM;
import org.emdcs.test.utility.Log1;
import org.testng.annotations.Test;

import core.Launchbrowser;

public class VerifyViewSalesOrdersByMNAOOrderNumber extends Launchbrowser{
	
	@Test()
		public void mnaoOrderNumber() throws Exception {
			test = extent.createTest("VerifyViewSalesOrdersByMNAOOrderNumber",
					"This test case will check the mnaoOrderNumber");
			Log1.info("=======Starting VerifyCSOpartsOrdering test========");
			// partsviewmenu.todaySalesOrders();
			PartsviewmenuPOM partsviewmenu = new PartsviewmenuPOM(driver);
			partsviewmenu.Selectdealer("61460");
			Log1.info(   "Select the Dealer Number");
			partsviewmenu.clickPartsViewMenu();
			Log1.info(   "Click on Parts View Menu");
			partsviewmenu.clickMnaoOrderNumber();
			Log1.info(   "Click on Sales Order By MNAO Order Number");
			partsviewmenu.clickEnterMnaoOrderNumber();
			Log1.info(   "Enter the MNAO Order Number");
			// this is generic sbmit button methods
			partsviewmenu.clickpartNumberSubmit();
			Log1.info(   "click on MNAO Order Number submit button");

			Log1.info(
					"SalesOrders By MNAO Order Number view successfully");
			Log1.info("=======Finished mnaoOrderNumber view test========");
		}


}
