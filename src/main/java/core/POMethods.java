package core;

import java.util.ArrayList;

public class POMethods {

	private int SerialNo;
	private String VendorName;
	private String VendorEmail;
	private String Dept;
	private String BuyerName;
	private String PaymentTerms;
	private String FOBState;
	private String CarrierDomestic;
	private String StartShipDate;
	private String ConsolidatorCancelDate;
	private String DCCancelDate;
	private String ItemNumber1;
	private String ItemNumber2;
	private int itemCnt;
	private String InternalId;
	private ArrayList<String> ItemNumbers;

	@Override
	public String toString() {
		return "POMethods [SerialNo=" + SerialNo + ", VendorName=" + VendorName
				+ ", VendorEmail=" + VendorEmail + ", Dept=" + Dept
				+ ", BuyerName=" + BuyerName + ", PaymentTerms=" + PaymentTerms
				+ ", FOBState=" + FOBState + ", CarrierDomestic="
				+ CarrierDomestic + ", StartShipDate=" + StartShipDate
				+ ", ConsolidatorCancelDate=" + ConsolidatorCancelDate
				+ ", DCCancelDate=" + DCCancelDate + ", ItemNumber1="
				+ ItemNumber1 + ", ItemNumber2=" + ItemNumber2 + ", itemCnt="
				+ itemCnt + ", InternalId=" + InternalId + ", ItemNumbers="
				+ ItemNumbers + "]";
	}

	public String getInternalId() {
		return InternalId;
	}

	public void setInternalId(String internalId) {
		InternalId = internalId;
	}

	public int getItemCnt() {
		return itemCnt;
	}

	public void setItemCnt(int itemCnt) {
		this.itemCnt = itemCnt;
	}

	

	public int getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public String getVendorEmail() {
		return VendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		VendorEmail = vendorEmail;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getBuyerName() {
		return BuyerName;
	}

	public void setBuyerName(String buyerName) {
		BuyerName = buyerName;
	}

	public String getPaymentTerms() {
		return PaymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		PaymentTerms = paymentTerms;
	}

	public String getFOBState() {
		return FOBState;
	}

	public void setFOBState(String fOBState) {
		FOBState = fOBState;
	}

	public String getCarrierDomestic() {
		return CarrierDomestic;
	}

	public void setCarrierDomestic(String carrierDomestic) {
		CarrierDomestic = carrierDomestic;
	}

	public String getStartShipDate() {
		return StartShipDate;
	}

	public void setStartShipDate(String startShipDate) {
		StartShipDate = startShipDate;
	}

	public String getConsolidatorCancelDate() {
		return ConsolidatorCancelDate;
	}

	public void setConsolidatorCancelDate(String consolidatorCancelDate) {
		ConsolidatorCancelDate = consolidatorCancelDate;
	}

	public String getDCCancelDate() {
		return DCCancelDate;
	}

	public void setDCCancelDate(String dCCancelDate) {
		DCCancelDate = dCCancelDate;
	}

	public String getItemNumber1() {
		return ItemNumber1;
	}

	public void setItemNumber1(String itemNumber1) {
		ItemNumber1 = itemNumber1;
	}

	public String getItemNumber2() {
		return ItemNumber2;
	}

	public void setItemNumber2(String itemNumber2) {
		ItemNumber2 = itemNumber2;
	}

	public ArrayList<String> getItemNumbers() {
		return ItemNumbers;
	}

	public void setItemNumbers(ArrayList<String> itemNumbers) {
		ItemNumbers = itemNumbers;
	}

}
