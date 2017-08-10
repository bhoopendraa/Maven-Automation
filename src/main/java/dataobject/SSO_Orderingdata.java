package dataobject;

import java.io.IOException;
import java.util.Properties;


public class SSO_Orderingdata {
	

	private String excelfilename1;
	private String increase;
	
	
	private Properties properties = new Properties();

	public SSO_Orderingdata() throws IOException {
		properties.load(SSO_Orderingdata.class
				.getResourceAsStream("/logindata.properties"));
		excelfilename1 = properties.getProperty("excelfilename1");
		//increase=properties.getProperty(increase);
		
	}

	
	public String getExcelfilename() {
		return excelfilename1;
	}
	/*public String getincrease() {
		return increase;
	}
*/

}
