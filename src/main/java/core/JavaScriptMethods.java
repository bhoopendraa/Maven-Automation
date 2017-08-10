package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptMethods {
	
	
	WebDriver driver;
	public JavaScriptMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method to Scroll-up
	public void Scrollup(WebElement element){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 0)"); // this will scroll up
	}
	
	public void ScrolltoElement(WebElement element){
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
