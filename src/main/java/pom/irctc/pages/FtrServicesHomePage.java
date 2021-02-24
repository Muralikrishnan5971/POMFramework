package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrServicesHomePage extends GenericWrappers {
	
	public FtrServicesHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FtrServicesCreateNewUserPage clickOnNewUserSignUp() {
		
		clickByXpath(prop.getProperty("FtrServicesHomePage.NewUser.XPath"));
		return new FtrServicesCreateNewUserPage(driver, test);
	}

	
	
}
