package core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFileRobot {

	public static void setClipboardData(String string) {

		StringSelection stringSelection = new StringSelection(string);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

	}

	public static void uploadFile(String filePath) throws AWTException, InterruptedException {

		// Setting clipboard with file location
		setClipboardData(filePath);

		// native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(1000);

	}
}