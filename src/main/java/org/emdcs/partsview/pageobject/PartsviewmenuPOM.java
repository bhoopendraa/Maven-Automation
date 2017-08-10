package org.emdcs.partsview.pageobject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.emdcs.partsordering.pageobject.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Launchbrowser;


public class PartsviewmenuPOM extends Launchbrowser{
	private WebDriver driver;
  public PartsviewmenuPOM(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  @FindBy(linkText="Parts View Menu")
  WebElement partsviewmenu;
  @FindBy(linkText="Today's Sales Orders")
  WebElement todaysalesorders;
  @FindBy(linkText="Sales Orders By Order Type")
  WebElement salesordersbyordertype;
  @FindBy(xpath="/html/body/form/table/tbody/tr/td/div/b/select")
  WebElement selectdealer;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/div/font/select")
  WebElement ordertype;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr[2]/td[3]/div/font/select")
  WebElement salesOrderStatus;
  @FindBy(xpath=".//*[@id='view']/form/div/input")
  WebElement submit;
  //this xpath is for both partNumber and Cust PO Number
  @FindBy(xpath="/html/body/div[4]/form/div/input")
  WebElement partNumberSubmit;
  @FindBy(linkText="Sales Orders By Part Number")
  WebElement partNumber;
  @FindBy(linkText="Sales Orders By MNAO Order Number")
  WebElement mnaoOrderNumber;
  @FindBy(linkText="Track Shipments By Order")
  WebElement trackShipmentByOrder;
  @FindBy(linkText="Invoice By Part Number")
  WebElement invoiceByPartNumber;
  @FindBy(linkText="Sales Orders By Invoice Number")
  WebElement invoiceNumber;
  @FindBy(linkText="Track Shipments By Date")
  WebElement trackShipmentByDate;
  
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/div/font/input")
  WebElement enterPartNumber;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/div/font/input")
  WebElement enterCustPONumber;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/div/font/input")
  WebElement enterMnaoOrderNumber;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/font/input")
  WebElement entersalesOrderForTrackShipment;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/div/font/input")
  WebElement enterInvoiceNumber;
  @FindBy(xpath="/html/body/div[4]/form/table/tbody/tr/td[3]/div/font/input")
  WebElement enterInvoiceByPartNumber;
  
  
  @FindBy(linkText="Sales Orders By Cust PO Number")
  WebElement custPONumber;
  public PartsviewmenuPOM clickTrackShipmentByOrder() {
	  trackShipmentByOrder.click();
		return this;
		}
  public PartsviewmenuPOM clickInvoiceByPartNumber() {
	  invoiceByPartNumber.click();
		return this;
		}
  public PartsviewmenuPOM clickTrackShipmentByDate() {
	  trackShipmentByDate.click();
		return this;
		}
  public PartsviewmenuPOM clickPartsViewMenu() {
	  partsviewmenu.click();
		return this;
		}
  public PartsviewmenuPOM clickInvoiceNumber() {
	  invoiceNumber.click();
		return this;
		}
  public PartsviewmenuPOM clickCustPONumber() {
	  custPONumber.click();
		return this;
		}
  public PartsviewmenuPOM clickMnaoOrderNumber() {
	  mnaoOrderNumber.click();
		return this;
		}
  public PartsviewmenuPOM clickpartNumberSubmit() {
	  partNumberSubmit.click();
		return this;
		}
  public PartsviewmenuPOM clickEnterPartNumber() {
	  enterPartNumber.sendKeys("K80215202");
		return this;
		}
  public PartsviewmenuPOM clickEnterMnaoOrderNumber() {
	  enterMnaoOrderNumber.sendKeys("244901");
		return this;
		}
  public PartsviewmenuPOM clickEnterCustPONumber() {
	  enterCustPONumber.sendKeys("2017DMSCSODS04");
		return this;
		}
  public PartsviewmenuPOM clickEnterSalesOrderForTrackShipment() {
	  entersalesOrderForTrackShipment.sendKeys("245269");
		return this;
		}
  
  public PartsviewmenuPOM clickEnterInvoiceNumber() {
	  enterInvoiceNumber.sendKeys("107525");
		return this;
		}
  public PartsviewmenuPOM clickEnterInvoiceByPartNumber() {
	  enterInvoiceByPartNumber.sendKeys("K80215202");
		return this;
		}
  public PartsviewmenuPOM clickPartNumber() {
	  partNumber.click();
		return this;
		}
  public PartsviewmenuPOM clickTodaySalesOrder() {
	  todaysalesorders.click();
		return this;
		}
  public PartsviewmenuPOM Selectdealer(String sOption) {
		Select _sel = new Select(selectdealer);
		_sel.selectByVisibleText(sOption);
		return this;
		
		}
  public PartsviewmenuPOM clickSalesOrdersByOrderType() {
	  salesordersbyordertype.click();
		return this;
		}
  public PartsviewmenuPOM clickSelectOrderType(String sOption) {
		Select _sel = new Select(ordertype);
		_sel.selectByVisibleText(sOption);
		return this;
  }
  public PartsviewmenuPOM clickSalesOrderStatus(String sOption) {
		Select _sel = new Select(salesOrderStatus);
		_sel.selectByVisibleText(sOption);
		return this;
}
  public PartsviewmenuPOM clickSubmit() {
	  submit.click();
		return this;
		}
  public String beginningDate(){
	  DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy ");
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -5);    
        String beginningDate=dateFormat.format(cal.getTime());
		  System.out.println("Start_date = "+  beginningDate);
		return beginningDate;
  }
 /* public HomePage todaySalesOrders() throws IOException, Exception, InterruptedException{
		
		//DMS_CSO_Ordering data1 = new DMS_CSO_Ordering(driver);
	  
	  Selectdealer("61460");
	  clickPartsViewMenu();
	 Thread.sleep(5000);
	  clickTodaySalesOrder();
		
		 Thread.sleep(5000);
		return new HomePage(driver);
		}*/
}
