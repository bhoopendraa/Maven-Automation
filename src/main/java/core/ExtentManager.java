package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ExtentManager {
	public static String captureScreenshot(WebDriver driver, String screenshotName) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);
		/*	String dest = "D:\\Selenium_Work\\DMS_Automation\\resource\\" + screenshotName
					+ ".png";*/
			String dest=System.getProperty("user.dir")+"/errorScreenShots/"+screenshotName
					+ ".png";
			File destination = new File(dest);

			FileUtils.copyFile(source, destination);

			System.out.println("Screenshot taken");
			return dest;

		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
			return e.getMessage();
		}
	}

	public static File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	/*public static int getRecordsCountInXLS(String downloadPath, String xlsFileName) throws BiffException, IOException {
		int lineNumberCount = 0;
		try {
			if (!xlsFileName.isEmpty() || xlsFileName != null) {
				String filePath = downloadPath + System.getProperty("file.separator") + xlsFileName;
				System.out.println(filePath);
				File file = new File(filePath);
				if (file.exists()) {
					System.out.println("File found :" + xlsFileName);
					FileInputStream fs = new FileInputStream(filePath);
					Workbook wb = Workbook.getWorkbook(fs);

					Sheet sh = wb.getSheet(0);
					lineNumberCount = sh.getRows();
				}
				// To remove the header
				lineNumberCount = lineNumberCount - 1;
				System.out.println("Total number of lines found in xls : " + (lineNumberCount));

			} else {
				System.out.println("File does not exists");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return lineNumberCount;
	}*/

}