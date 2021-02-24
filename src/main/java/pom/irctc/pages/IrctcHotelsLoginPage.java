package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsLoginPage extends GenericWrappers {
	
	public IrctcHotelsLoginPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelsLoginPage waitOnIrctcHotelsLoginPage() {
		
		waitProperty(3000);
		return this;
	}
	
	public IrctcHotelsLoginPage clickOnGuestUserLogin() {
		
		clickByXpath(prop.getProperty("IrctcHotelsLoginPage.GuestUserLogin.XPath"));
		return this;
	}
	
	public IrctcHotelsLoginPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("IrctcHotelsLoginPage.Email.XPath"), emailId);
		return this;
	}
	
	public IrctcHotelsLoginPage enterMobileNumber(String mobNo) {
		
		enterByXpath(prop.getProperty("IrctcHotelsLoginPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public IrctcHotelsHomePage clickOnSubmit() {
		
		clickByXpath(prop.getProperty("IrctcHotelsLoginPage.Submit.XPath"));
		return new IrctcHotelsHomePage(driver, test);
	}
	
}
