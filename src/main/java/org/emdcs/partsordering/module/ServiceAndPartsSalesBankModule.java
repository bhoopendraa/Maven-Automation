package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.ServiceAndPartsSalesBank;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;

public class ServiceAndPartsSalesBankModule extends Launchbrowser{
public void ServiceandpartSalesBankOrder(WebDriver driver) throws IOException, Exception, InterruptedException{
		
		ServiceAndPartsSalesBank sales_bank = new ServiceAndPartsSalesBank(driver);
		sales_bank.clickpartsordermenu();
		Log1.info("Parts Orderd menu Clicked");
		test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
		sales_bank.Selectdealer("61511");
		Log1.info("Dealer selected");
		test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
		sales_bank.clickOnServiceandPartsSalesBankLink();
		Log1.info("Click On Service and Parts Sales Bank Link");
		test.log(Status.INFO,MarkupHelper.createLabel("Click On Service and Parts Sales Bank Link",ExtentColor.BLUE));
		sales_bank.selectChecktoOrder0();
		Log1.info("Select parts to Order1");
		test.log(Status.INFO,MarkupHelper.createLabel("Select parts to Order1",ExtentColor.BLUE));
		sales_bank.selectChecktoOrder1();
		Log1.info("Select parts to Order2");
		test.log(Status.INFO,MarkupHelper.createLabel("Select parts to Order2",ExtentColor.BLUE));
		sales_bank.selectChecktoOrder2();
		Log1.info("Select parts to Order3");
		test.log(Status.INFO,MarkupHelper.createLabel("Select parts to Order3",ExtentColor.BLUE));
		sales_bank.selectChecktoOrder3();
		Log1.info("Select parts to Order4");
		test.log(Status.INFO,MarkupHelper.createLabel("Select parts to Order4",ExtentColor.BLUE));
		sales_bank.selectChecktoOrder4();
		Log1.info("Select parts to Order5");
		test.log(Status.INFO,MarkupHelper.createLabel("Select parts to Order5",ExtentColor.BLUE));
		sales_bank.clickOnOrderButton();
		Log1.info("Click On Order Button");
		test.log(Status.INFO,MarkupHelper.createLabel("Click On Order Button",ExtentColor.BLUE));
		 Thread.sleep(5000);
		}
}
