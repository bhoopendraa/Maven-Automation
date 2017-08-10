package dataobject;

import java.io.IOException;
import java.util.Properties;


public class Logindata {
	
	private String url;
	private String username;
	private String password;
	private String excelfilename2;
	
	
	private Properties properties = new Properties();

	public Logindata() throws IOException {
		properties.load(Logindata.class
				.getResourceAsStream("/resource/logindata.properties"));
		/*properties.load(Logindata.class
				.getResourceAsStream("main/java/resource/logindata.properties"));*/
		url = properties.getProperty("url");
		System.out.println(url);
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		excelfilename2 = properties.getProperty("excelfilename2");
		
	}

	public String geturl() {
		return url;
		}

	public String getusername() {
		return username;
		}

	public String getpassword() {
		return password;
		}

	
	
	public String getExcelfilename() {
		return excelfilename2;
	}


}
