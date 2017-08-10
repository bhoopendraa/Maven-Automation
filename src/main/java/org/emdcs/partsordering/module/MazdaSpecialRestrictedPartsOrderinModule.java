package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.MazdaSpecialRestrictedPartsOrdering;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Launchbrowser;

public class MazdaSpecialRestrictedPartsOrderinModule extends Launchbrowser {
public void mazdaSpecialRestrictedPartsOrdering(WebDriver driver) throws IOException, Exception, InterruptedException{
		
		MazdaSpecialRestrictedPartsOrdering res_parts = new MazdaSpecialRestrictedPartsOrdering(driver);
		res_parts.clickpartsordermenu();
		test.log(Status.INFO,MarkupHelper.createLabel("Parts Orderd menu Clicked",ExtentColor.BLUE));
		res_parts.clickOnSpecialRestrictedPartsOrderingLink();
		test.log(Status.INFO,MarkupHelper.createLabel("Click On Special Restricted PartsOrdering Link",ExtentColor.BLUE));
		res_parts.SelectselectRecalNo("8215F");
		test.log(Status.INFO,MarkupHelper.createLabel("Select recall Parts",ExtentColor.BLUE));
		res_parts.clickOnGoButton();
		test.log(Status.INFO,MarkupHelper.createLabel("Go Button Clicked",ExtentColor.BLUE));
		res_parts.Selectdealer("10316");
		test.log(Status.INFO,MarkupHelper.createLabel("Dealer selected",ExtentColor.BLUE));
		//clickOnOrderButton();
		 Thread.sleep(5000);
		}


}
