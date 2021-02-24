package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterHomePage extends GenericWrappers{
	
	public CharterHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public CharterHomePage clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("CharterHomePage.EnquiryForm.XPath"));
		return this;
	}

	public CharterHomePage enterName(String name) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Name.XPath"), name);
		return this;
	}
	
	public CharterHomePage enterOrgName(String orgName) {
		
		enterByXpath(prop.getProperty("CharterHomePage.OrgName.XPath"), orgName);
		return this;
	}
	
	public CharterHomePage enterAddress(String add) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Address.XPath"), add);
		return this;
	}
	
	public CharterHomePage entermobileNo(String mobNo) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public CharterHomePage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Email.XPath"), emailId);
		return this;
	}
	
	public CharterHomePage selectSaloonCharter(String option) {
		
		selectVisibileTextByXpath(prop.getProperty("CharterHomePage.SaloonCarter.XPath"), option);
		return this;
	}
	
	public CharterHomePage enterOriginationStation(String originStation) {
		
		enterByXpath(prop.getProperty("CharterHomePage.OriginStation.XPath"), originStation);
		return this;
	}
	
	public CharterHomePage enterDestinationStation(String destStation) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Destination.XPath"), destStation);
		return this;
	}
	
	public CharterHomePage clickOnDateOfDepature() {
		
		clickByXpath(prop.getProperty("CharterHomePage.DepartureField.XPath"));
		return this;
	}
	
	public CharterHomePage clickDepatureDate() {
		
		clickByXpath(prop.getProperty("CharterHomePage.DepartureDate.XPath"));
		return this;
	}
	
	public CharterHomePage clickOnDateOfArrival() {
		
		clickByXpath(prop.getProperty("CharterHomePage.ArrivalField.XPath"));
		return this;
	}
	
	public CharterHomePage scrollDownCharterHomePage() {
		
		pageDownArrow();
		return this;
	}
	
	public CharterHomePage waitOnCharterHomePage() {
		
		waitProperty(3000);
		return this;
	}
	
	public CharterHomePage clickArrivalDate() {
		
		clickByXpath(prop.getProperty("CharterHomePage.ArrivalDate.XPath"));
		return this;
	}
	
	public CharterHomePage enterDurationOfTour(String duration) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Duration.XPath"), duration);
		return this;
	}
	
	public CharterHomePage enterCoachDetails(String coachDetails) {
		
		enterByXpath(prop.getProperty("CharterHomePage.CoachDetails.XPath"), coachDetails);
		return this;
	}
	
	public CharterHomePage enterNumberOfPassengers(String noOfPass) {
		
		enterByXpath(prop.getProperty("CharterHomePage.NoOfPassengers.XPath"), noOfPass);
		return this;
	}
	
	public CharterHomePage enterPurposeOfCharter(String purpose) {
		
		enterByXpath(prop.getProperty("CharterHomePage.Purpose.XPath"), purpose);
		return this;
	}
	
	public CharterHomePage enterAdditionalServices(String addServices) {
		
		enterByXpath(prop.getProperty("CharterHomePage.AdditionalServices.XPath"), addServices);
		return this;
	}
	
	public CharterHomePage clickOnSubmit() {
		
		clickByXpath(prop.getProperty("CharterHomePage.Submit.XPath"));
		return this;
	}
	
	public CharterHomePage verifyMobileNoErrorMsg() {
		
		verifyTextByXpath(prop.getProperty("CharterHomePage.MobileNoErrorMsg.XPath"), "Mobile no. not valid");
		return this;
	}
	
	
}
