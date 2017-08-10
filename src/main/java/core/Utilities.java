package core;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utilities {
	
	WebDriver driver;
	public Utilities(WebDriver driver) {
		this.driver = driver;
		}
	
	/*
	public void getScreenshot(String name) throws IOException{
				
		//Capture the Screenshot from Browser
		
		File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Get file format
		String imageFileName = name+new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss").format(new GregorianCalendar().getTime())+ ".png";
		
		File file1= new File("R:\\Excel\\"+imageFileName);
		FileUtils.moveFile(imageFile, file1);
		

	}
*/

}
