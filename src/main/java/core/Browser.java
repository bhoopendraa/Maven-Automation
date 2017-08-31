package core;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Browser {

	public WebDriver driver;
	public WebDriver launch(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"chromedriver\\chromedriver");
			driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("FF")) {
			// driver = new FirefoxDriver();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setEnableNativeEvents(true);
			driver = new FirefoxDriver(profile);

		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"R:\\Windows8.1-KB2990999-x64.msu");
			;
			driver = new InternetExplorerDriver();
			// driver.manage().window().maximize();
		}
		return driver;
	}

}
