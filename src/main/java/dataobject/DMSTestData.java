package dataobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import core.DMSMethod;
import core.POMethods;

public class DMSTestData {

	static List<DMSMethod> dmsdata = new ArrayList<DMSMethod>();
	public static List<DMSMethod> readExceldata() throws IOException {

		Logindata data1 = new Logindata();
		String filename = data1.getExcelfilename();
		FileInputStream inputstream = new FileInputStream(filename);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(2);
		XSSFCell cell = null;
		// int rowCount = sheet.getLastRowNum();
		// for (int i=1; i <=rowCount; i++) {
		DMSMethod do1 = new DMSMethod();
		cell = sheet.getRow(1).getCell(0);
		do1.setdealerCode(cell.getStringCellValue());
		dmsdata.add(do1);
		System.out.println(dmsdata);
		return dmsdata;
}
	@DataProvider(name = "DMSData")
	public static Object[][] getPOData() throws IOException {

		List<DMSMethod> do2 = readExceldata();
		Object[][] data = new Object[do2.size()][1];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = do2.get(i);
			}
		}
		return data;

	}

}
