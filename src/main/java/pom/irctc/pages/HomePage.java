package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public HomePage clickOkForAlert() {
		
		clickByXpath(prop.getProperty("HomePage.OkForAlert.XPath"));
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnRegister() {
		
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegistrationBasicDetailsPage(driver, test);
	}
	
	public HomePage mouseHoverOnHolidays() {
		
		mouseHoverTo(prop.getProperty("HomePage.Holidays.XPath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		
		mouseHoverTo(prop.getProperty("HomePage.Stays.XPath"));
		return this;
	}
	
	public HomePage clickOnLounge() {
		
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return this;
	}
	
	public AccomodationHomePage switchToAccomodationPage() {
		
		switchToLastWindow();
		return new AccomodationHomePage(driver, test);
	}
	
	
}
