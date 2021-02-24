package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationHomePage extends GenericWrappers {
	
	public AccomodationHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public AccomodationHomePage clickOnMenu() {
		
		clickByXpath(prop.getProperty("AccomodationHomePage.Menu.XPath"));
		return this;
	}
	
	public AccomodationHomePage clickOnBookYourCoachTrain() {
		
		clickByXpath(prop.getProperty("AccomodationHomePage.BookYourCoach.XPath"));
		return this;
	}
	
	public FtrServicesHomePage switchToFtrServicesHomePage() {
		
		switchToLastWindow();
		return new FtrServicesHomePage(driver, test);
	}
	
	public CharterHomePage clickOnCharter() {
		
		clickByXpath(prop.getProperty("AccomodationHomePage.Charter.XPath"));
		return new CharterHomePage(driver, test);
	}
	
	public IrctcHotelsHomePage clickOnIrctcHotels() {
		
		clickByXpath(prop.getProperty("AccomodationHomePage.IrctcHotels.XPath"));
		return  new IrctcHotelsHomePage(driver, test);
	}
	
}
