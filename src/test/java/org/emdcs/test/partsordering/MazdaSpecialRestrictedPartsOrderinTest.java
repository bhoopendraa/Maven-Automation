package org.emdcs.test.partsordering;


import java.util.List;

import org.emdcs.partsordering.module.MazdaSpecialRestrictedPartsOrderinModule;
import org.emdcs.partsordering.pageobject.MazdaSpecialRestrictedPartsOrdering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.*;

public class MazdaSpecialRestrictedPartsOrderinTest extends Launchbrowser {
	String actual_res=null;
	 @Test(dataProvider="getVin")
	  public void Verify_MazdaSpecialRestrictedPartsOrderin(String vin01,String vin02) throws Exception {
		 test=extent.createTest("Verify_MazdaSpecialRestrictedPartsOrderin","This test case will check the Restricted Parts Order");
		 MazdaSpecialRestrictedPartsOrderinModule data1 = new MazdaSpecialRestrictedPartsOrderinModule();
		data1.mazdaSpecialRestrictedPartsOrdering(driver);
		List<WebElement>  OverrideRbtn=driver.findElements(By.name("overRide"));
		boolean bValue = false;
		bValue = OverrideRbtn.get(0).isSelected();
		if(bValue == true){
			
			OverrideRbtn.get(1).click();
		}else{
			OverrideRbtn.get(0).click();
		}
		 Thread.sleep(5000);
		List<WebElement>  OrderTypeRdobtn=driver.findElements(By.name("orderType"));
		boolean bValue1 = false;
		bValue1 = OrderTypeRdobtn.get(0).isSelected();
		if(bValue1 == true){
			
			OrderTypeRdobtn.get(1).click();
		}else{
			OrderTypeRdobtn.get(0).click();
		}
		WebElement numVehicles=driver.findElement(By.name("numVehicles"));
		numVehicles.sendKeys("2");
		WebElement vin1=driver.findElement(By.name("vin1"));
		vin1.sendKeys(vin01);
		WebElement vin2=driver.findElement(By.name("vin2"));
		vin2.sendKeys(vin02);
		List<WebElement> vin1VehDown=driver.findElements(By.name("vin1VehDown"));
		vin1VehDown.get(0).click();
		List<WebElement> vin2VehDown=driver.findElements(By.name("vin2VehDown"));
		vin2VehDown.get(0).click();
		WebElement purchaseOrderNo=driver.findElement(By.name("purchaseOrderNo"));
		purchaseOrderNo.sendKeys("SPARTS000");
		WebElement altShipTo=driver.findElement(By.name("altShipTo"));
		altShipTo.sendKeys("000");
		WebElement vinsubmit=driver.findElement(By.name("vinsubmit"));
		vinsubmit.click();
		 Thread.sleep(5000);
	}	 
	 
	 @DataProvider(name="getVin")
	 public Object[][] passData()
	 {
		 ExcelDataConfigrution config=new ExcelDataConfigrution("src\\main\\java\\resource\\TestData.xlsx");
		 int rows =config.getRowCount(0);
		 System.out.println(rows);
		 Object[][] data=new Object[rows][2];
		 for(int i=0;i<rows;i++)
		 {
			 data[i][0]=config.getData(0, i, 0);
			 data[i][1]=config.getData(0, i, 1);
		 }
		 /*Object[][] data=new Object[1][2];
		 data[0][0]="4F4YR12DX4TM00142";
		 data[0][1]="4F4YR12DX4TM00142";*/
		return data;
	 }
	
}
