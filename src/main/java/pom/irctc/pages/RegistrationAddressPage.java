package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationAddressPage extends GenericWrappers {
	
	public RegistrationAddressPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationAddressPage enterFlatNo(String flatNo) {
		
		enterByXpath(prop.getProperty("RegistrationAddressPage.FlatNo.XPath"), flatNo);
		return this;
	}
	
	public RegistrationAddressPage enterStreet(String street) {
		
		enterByXpath(prop.getProperty("RegistrationAddressPage.Street.XPath"), street);
		return this;
	}
	
	public RegistrationAddressPage enterArea(String area) {
		
		enterByXpath(prop.getProperty("RegistrationAddressPage.Area.XPath"), area);
		return this;
	}
	
	public RegistrationAddressPage enterPinCode(String pinCode) {
		
		enterByXpath(prop.getProperty("RegistrationAddressPage.PinCode.XPath"), pinCode);
		return this;
	}
	
	public RegistrationAddressPage enterState(String state) {
		
		enterByXpath(prop.getProperty("RegistrationAddressPage.State.XPath"), state);
		return this;
	}

	public RegistrationAddressPage selectCity(String city) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationAddressPage.City.XPath"), city);
		return this;
	}
	
	public RegistrationAddressPage selectPostOffice(String postOff) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationAddressPage.PostOffice.XPath"), postOff);
		return this;
	}
	
	public RegistrationAddressPage enterPhoneNo(String phoneNo) {
		
		enterByXpath(prop.getProperty("RegistrationAddressPage.Phone.XPath"), phoneNo);
		return this;
	}
	
	public RegistrationAddressPage clickOnYes() {
		
		clickByXpath(prop.getProperty("RegistrationAddressPage.ClickYes.XPath"));
		return this;
	}
	
	public RegistrationAddressPage clickOnRegisterBtn() {
		
		clickByXpath(prop.getProperty("RegistrationAddressPage.RegisterBtn.XPath"));
		return this;
	}
	
}
