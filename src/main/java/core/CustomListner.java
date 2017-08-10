package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
public class CustomListner extends TestListenerAdapter{
	WebDriver driver;
	public void onTestFailure(ITestResult tr)
	{
		try
		{
		TakesScreenshot ts=((TakesScreenshot)Launchbrowser.driver);
		File scrFile =ts.getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		 
			FileUtils.copyFile(scrFile, new File("./resource/"+tr.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
