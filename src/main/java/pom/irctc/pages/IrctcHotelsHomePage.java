package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsHomePage extends GenericWrappers {
	
	public IrctcHotelsHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelsLoginPage clickOnLogin() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.Login.XPath"));
		return new IrctcHotelsLoginPage(driver, test);
	}
	
	public IrctcHotelsHomePage enterDestination(String dest) {
		
		enterByXpath(prop.getProperty("IrctcHotelsHomePage.Destination.XPath"), dest);
		return this;
	}
	
	public IrctcHotelsHomePage clickOnDest() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.ClickDestination.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage clickOnCheckInDateField() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.CheckInField.XPath"));
		return this;
	}
	
	public  IrctcHotelsHomePage clickOnCheckInDate() {
				
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.ChechkInDate.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage clickOnCheckOutDateField() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.CheckOutField.XPath"));
		return this;
	}
	
	public  IrctcHotelsHomePage clickOnCheckOutDate() {
				
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.CheckOutDate.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage clickOnRooms() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.Rooms.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage selectNoOfRooms(String rooms) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsHomePage.NoOfRooms.XPath"), rooms);
		return this;
	}
	
	public IrctcHotelsHomePage selectNoOfAdults(String adults) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsHomePage.NoOfAdults.XPath"), adults);
		return this;
	}
	
	public IrctcHotelsHomePage selectNoOfChild(String child) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsHomePage.NoOfChild.XPath"), child);
		return this;
	}
	
	public IrctcHotelsHomePage clickOnDone() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.ClickDone.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage clickOnFindHotel() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.FindHotel.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage waitOnIrctcHotelsHomePage() {
		
		waitProperty(3000);
		return this;
	}
	
	public IrctcHotelsHomePage switchToIrctcHotelsHomePage() {
		
		switchToLastWindow();
		return new IrctcHotelsHomePage(driver, test);
	}
	
	public IrctcHotelsHomePage clickOnFirstDisplayedHotel() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.FirstDisplayedHotel.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage getHotelName() {
		
		getTextByXpath(prop.getProperty("IrctcHotelsHomePage.GetHotelName.XPath"));
		return this;
	}
	
	public IrctcHotelsHomePage getHotelPrice() {
		
		getTextByXpath(prop.getProperty("IrctcHotelsHomePage.GetHotelPrice.XPath"));
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage clickOnContinueToBook() {
		
		clickByXpath(prop.getProperty("IrctcHotelsHomePage.ContinueToBook.XPath"));
		return new IrctcHotelsPassengerDetailsPage(driver, test);
	}
	
}
