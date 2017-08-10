package org.emdcs.test.partsreturn;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.emdcs.partsreturns.module.CreatePartsReturnRequestModule;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import core.*;

public class PartsReturnRequestTest extends Launchbrowser { 
	String actual_res=null;
	public static String numberAsString;
	 @Test(priority=1)
	  public void VerifyPartsReturnRequest() throws Exception {
		 test=extent.createTest("PartsReturnRequestTest:VerifyPartsReturnRequest","This test case will check the  Parts Return Request");
		 CreatePartsReturnRequestModule data1 = new CreatePartsReturnRequestModule();
		data1.partsReturnsRequest(driver);
		Thread.sleep(5000);
		String Parent_Window = driver.getWindowHandle(); 
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> li=s1.iterator();
		while(li.hasNext())
		{
			String child_window=li.next();
			if(!Parent_Window.equalsIgnoreCase(child_window))
	     driver.switchTo().window(child_window);
	     System.out.println(driver.getTitle());
	     }
		String actual_Result="Your return has been successfully Transmitted.";
	String expected_Result=	driver.findElement(By.xpath(".//*[@id='invalidFlag']/p")).getText();
		System.out.println("Expected Result Is : "+expected_Result);
			Assert.assertEquals(actual_Result,expected_Result);
			Reporter.log("Parts Ordered Successfully"+expected_Result);
	}
}
