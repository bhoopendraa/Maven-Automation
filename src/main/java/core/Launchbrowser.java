package core;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.emdcs.partsordering.module.LoginEmdcsModule;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Launchbrowser {

	public static WebDriver driver = null;
	public  static ExtentReports extent;
	public  static  ExtentTest test; 
	public  static ExtentHtmlReporter htmlReporter;
	
	@BeforeSuite()
	public void setUp()
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/Emdcsreport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("OS","WIN10");
		extent.setSystemInfo("Host Name","VArun");
		extent.setSystemInfo("Envirorment","TEST");
		extent.setSystemInfo("USER NAME","VARUN");
		
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("EMDCS Test Result");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("EMDCS Execution Result");

	}
	
	@BeforeMethod()
	public void launchbrowser() throws InterruptedException, IOException {
		DOMConfigurator.configure("log4j.xml");
		System.out.println("Pre-Method lounched");
		//Log.startTestCase("Selenium_Test_001");
		if (driver == null) {
			this.driver = new Browser().launch("Chrome");
			driver.manage().window().maximize();
		}
		driver.manage().deleteAllCookies();
		LoginEmdcsModule Login1 = new LoginEmdcsModule();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login1.Loginuser(driver);
		//Creates Object for Wait functionality and Call Wait for Page to load Method
		/*WaitMethods W1 = new WaitMethods(driver);
		W1.WaitForPageLoad();*/
		Thread.sleep(WaitMethods.launchBrowserDelay);
		//report = ExtentManager.Instance();
	}
	
	/*@BeforeMethod()
	@Parameters("browser")
	public void launchbrowser(@Optional("Chrome") String browser)
			throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Test\\chromedriver.exe");
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
			driver = new InternetExplorerDriver();
			// driver.manage().window().maximize();
		}

	}
	*/
	

	@AfterMethod()
	public void closebrowser(ITestResult result) throws IOException, Exception {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshot_path = ExtentManager.captureScreenshot(driver, result.getName());
			//String image = test.addScreenCaptureFromPath(screenshot_path);
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Test Case Fail",ExtentColor.RED));
			test.fail(result.getThrowable());
			test.fail("SnapShots Below: "+test.addScreenCaptureFromPath(screenshot_path));
			
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"Test Case PASSED",ExtentColor.GREEN));
		}
		else 
		{
			test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"Test Case SKIPPED",ExtentColor.YELLOW));
		}
	}
	

	@AfterTest()
	public void exitbrowser() throws Exception {
		/*report.endTest(logger);
		report.flush();*/
		/*RW_File.updateData("seqNumber",SSOOrderingTest.numberAsString);
		System.out.println(SSOOrderingTest.numberAsString);
		Thread.sleep(20000);*/
		driver.quit();
		
	}
	@AfterSuite()
	public void tearDown()
	{
		extent.flush();
	}

}
