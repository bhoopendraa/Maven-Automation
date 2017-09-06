package browserstacktestcase;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.emdcs.partsavailability.module.PartsAvailabilityModule;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import browserstack.TestBase;


public class PartsAvailabilitybrowserstack extends TestBase{
	String actual_res=null;
	public static String numberAsString;
	public static WebDriver driver;
	 @Test()
	  public void verifyPartsAvailability() throws Exception {
		// test=extent.createTest("PartsAvailability Test:verifyPartsAvailability","This test case will check the  Parts Availability");
		 PartsAvailabilityModule data1 = new PartsAvailabilityModule();
		
		data1.partsAvailability(driver);
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
		String actual_Result="Parts Availability Inquiry";
		String expected_Result=	driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[2]/div")).getText();
		System.out.println("Expected Result Is : "+expected_Result);
			Assert.assertEquals(actual_Result,expected_Result);
			 File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 try {
			      FileUtils.copyFile(srcFile, new File("Screenshot.png"));
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
			Reporter.log("Parts Availability Successfully"+expected_Result);
	}
}
