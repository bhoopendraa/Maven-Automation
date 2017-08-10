package org.emdcs.partsordering.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Parent Domestic Form opening
	public void ParentDomesticForm() {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/item/item.nl?itemtype=InvtPart&subtype=&isserialitem=F&islotitem=F");
	}

	// Parent Import Form opening
	public void ParentImportForm() {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/item/item.nl?itemtype=InvtPart&subtype=&isserialitem=F&islotitem=F&cf=37&whence=");
	}

	// Child Domestic Form opening
	public void ChildDomesticForm() {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/item/item.nl?itemtype=InvtPart&subtype=&isserialitem=F&islotitem=F&cf=8&whence=");
	}

	// Child Import Form opening
	public void ChildImportForm() {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/item/item.nl?itemtype=InvtPart&subtype=&isserialitem=F&islotitem=F&cf=8&whence=");
	}

	// Purchase Order Domestic Form opening
	public void PODomesticForm() {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/accounting/transactions/purchord.nl?whence=");
	}

	// Open PO record
	public void TransmitPO(String POInternalId) {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/accounting/transactions/purchord.nl?id="
						+ POInternalId + "&whence=");
	}

	public void findParent(String parentNumber) {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/search/ubersearchresults.nl?quicksearch=T&searchtype=Uber&frame=be&Uber_NAMEtype=KEYWORDSTARTSWITH&Uber_NAME="
						+ parentNumber);
	}

	public void findChild(String childSKU) {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/search/ubersearchresults.nl?quicksearch=T&searchtype=Uber&frame=be&Uber_NAMEtype=KEYWORDSTARTSWITH&Uber_NAME="
						+ childSKU);
	}

	public void EditPO(String PONumber) {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/common/search/ubersearchresults.nl?quicksearch=T&searchtype=Uber&frame=be&Uber_NAMEtype=KEYWORDSTARTSWITH&Uber_NAME="
						+ PONumber);
	}

	public void CopyParent(String parentInternalId) {
		driver.navigate().to(
				"https://system.sandbox.netsuite.com/app/common/item/item.nl?id="
						+ parentInternalId + "&whence=");
	}

	public void CopyChild(String childInternalId) {
		driver.navigate().to(
				"https://system.sandbox.netsuite.com/app/common/item/item.nl?id="
						+ childInternalId + "&whence=");
	}

	public void CopyPO(String POInternalId) {
		driver.navigate()
				.to("https://system.sandbox.netsuite.com/app/accounting/transactions/purchord.nl?id="
						+ POInternalId + "&whence=");
	}

}
