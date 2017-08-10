package org.emdcs.partsordering.module;

import java.io.IOException;

import org.emdcs.partsordering.pageobject.LoginEmdcs;
import org.emdcs.test.utility.Log1;
import org.openqa.selenium.WebDriver;

import core.Launchbrowser;
import dataobject.Logindata;

public class LoginEmdcsModule extends Launchbrowser {
	//Method calls all methods to perform necessary actions
		public void Loginuser(WebDriver driver) throws IOException{
			LoginEmdcs login=new LoginEmdcs(driver);
			Logindata data1 = new Logindata();
			login.openEMDCS(data1.geturl());
			Log1.info("Driver Launched successfully");
			login.enterUserName(data1.getusername());
			Log1.info("UserName Entered>>>>>>>>>"+data1.getusername());
			login.enterPassword(data1.getpassword());
			Log1.info("Password Entered>>>>>>>>>>"+data1.getpassword());
			login.LoginSubmit();
			}

}
