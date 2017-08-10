package org.emdcs.test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class RW_File {

	public static String readData(String key) throws Exception {
		String value = "";

		Properties properties = new Properties();
		File file = new File("src/main/java/resource/config.properties");
		System.out.println(file.exists());
		if (file.exists()) {
			FileInputStream	fis=new FileInputStream(file);
			//properties.load(new FileInputStream(file));
			properties.load(fis);
			value = properties.getProperty(key);
			fis.close();
			file.exists();
		}
		return value;
			
	}

	public static void updateData(String key, String val) throws Exception {
		File file = new File("src/main/java/resource/config.properties");
		Properties properties = new Properties();
		properties.load(new FileInputStream(file));
		FileOutputStream obj = new FileOutputStream(file);
		properties.setProperty(key, val);
		properties.store(obj, "Update data into file ");
		obj.flush();
		obj.close();
	    file.exists();
	}

	public static int generateNumber(String num) throws Exception {
		int New_CSO_orderNumber = Integer.parseInt(num);
		New_CSO_orderNumber++;
		return New_CSO_orderNumber;
	}

}
