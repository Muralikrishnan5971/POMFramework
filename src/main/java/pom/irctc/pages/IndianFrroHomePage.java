package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IndianFrroHomePage extends GenericWrappers{
	
	public IndianFrroHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public IndianFrroRegistrationPage clickOnSignUpRegistration() {
		
		clickByXpath(prop.getProperty("IndianFrroHomePage.Registration.XPath"));
		return new IndianFrroRegistrationPage(driver, test);
	}
}
