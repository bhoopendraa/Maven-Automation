package org.emdcs.test.utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver;

	public static void switchTochildWindow(WebDriver driver) {
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
}
	public static void switchTochildWindow2(WebDriver driver) {
		String Parent_Window = driver.getWindowHandle(); 
	  Set<String> s2=driver.getWindowHandles();
		Iterator<String> li2=s2.iterator();
		while(li2.hasNext())
		{
			String child_window1=li2.next();
			if(!Parent_Window.equalsIgnoreCase(child_window1))
	     driver.switchTo().window(child_window1);
	  // actual_res=driver.getTitle();
	     }
}
	public static void switchToParentWindow(WebDriver driver) {
		String Parent_Window = driver.getWindowHandle(); 
		driver.switchTo().window(Parent_Window);
}
}
