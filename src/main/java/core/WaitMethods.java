package core;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataobject.Logindata;

public class WaitMethods {
	
	public static int longDelay;
	public static int medDelay;
	public static int shortDelay;
	public static int launchBrowserDelay;
	
	WebDriver driver;
	
	public WaitMethods(WebDriver driver)  {
		try
		{
		Properties properties = new Properties();
		properties.load(Logindata.class
				.getResourceAsStream("resource/logindata.properties"));
		longDelay = Integer.parseInt(properties.getProperty("longdelay"));
		medDelay = Integer.parseInt(properties.getProperty("meddelay"));
		shortDelay = Integer.parseInt(properties.getProperty("shortdelay"));
		launchBrowserDelay = Integer.parseInt(properties.getProperty("launchbrowserdelay"));
		this.driver = driver;
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	
	
	//Method to check if element is clickable
	public void WaitforElementtobeClickable(int timeoutsecs, WebElement Element){
		WebDriverWait wait = new WebDriverWait(driver, timeoutsecs);
	    wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	
	//Method to check if element is displayed
		public void WaitforElementtobeDisplayed(int timeoutsecs, WebElement Element, String name){
			
			WebDriverWait wait = new WebDriverWait(driver, timeoutsecs);
		    wait.until(ExpectedConditions.textToBePresentInElement(Element, name));
		    
		}
	
	//	Method to Check if page is loaded completely.
	public void WaitForPageLoad() throws InterruptedException{
		
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  System.out.println("Current Window State"+String.valueOf((jse).executeScript("return document.readyState;")));
	  
		
		  for (int second = 0; second<=25; second++) {
	  	    	if (second >= 25){
	  	    		System.out.println("Page is not loaded for more than 60 seconds");
	  	    	}	
	    	try {
	    		if((jse).executeScript("return document.readyState;").equals("complete"))
	    			//System.out.println("Current Window State"+second +String.valueOf((jse).executeScript("return document.readyState;")));
	    		break; 
	    		} 
	    	catch(Exception e) {
	    		System.out.println("In catch");
	    		}
	    	Thread.sleep(WaitMethods.shortDelay);
		  }
		}
	
	//Method to get Element text and Wait for the Element text is displayed.
	
	public void Valuetodisplayed(int timeout, final WebElement element, final String text) throws InterruptedException {

		System.out.println("in Valuetodisplayed method");
		    
		for (int second = 0; second<=timeout; second++) {
	    	if (second >= timeout){
	    		System.out.println("Page is not loaded for more than"+timeout+"seconds");
	    	}	
	    	try {
	    		String elementText = element.getAttribute("title");
	    		elementText = elementText.trim();
	    		//System.out.println("dynamic valu is : "+elementText);
	    		//System.out.println(text);
	    		if(elementText.equalsIgnoreCase(text.trim())){
	    			//System.out.println("Abt to break for loop");
	    			break; }
  		} 
	    	catch(Exception e) {
	    		System.out.println("In catch");
  		}
	    	Thread.sleep(WaitMethods.shortDelay);
	  }  
	}
}
