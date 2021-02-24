package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OnlineUsVisaApplyHomePage extends GenericWrappers {
	
	public OnlineUsVisaApplyHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	
	public OnlineUsVisaApplyHomePage enterGivenName(String givenName) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.GivenName.XPath"), givenName);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterSurName(String surName) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.SurName.XPath"), surName);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterFullName(String fullName) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.FullName.XPath"), fullName);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage scrollUsVisaApplyHomePagePageDown() {
		
		pageDown();
		return this;
	}
	
	public OnlineUsVisaApplyHomePage waitOnUsVisaApplyPage() {
		
		waitProperty(3000);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnYesForOtherNames() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.OtherName.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterOtherSurName(String otherSurName) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.OtherSurName.XPath"), otherSurName);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterOtherGivenName(String otherGivenName) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.OtherGivenName.XPath"), otherGivenName);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Email.XPath"), emailId);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterConfirmEmailId(String confEmail) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.ConfirmEmail.XPath"), confEmail);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnYesForOtherEmailAddress() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.YesOtherEmail.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterAdditionalEmailAddress(String addEmail) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.AdditionalEmail.XPath"), addEmail);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnMale() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Male.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnDateOfBirth() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.DOB.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage selectBirthYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.BirthYear.XPath"), year);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage selectBirthMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.BirthMonth.XPath"), month);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnBirthDate() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.BirthDate.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterCityOfBirth(String birthCity) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.BirthCity.XPath"), birthCity);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterBirthState(String birthState) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.BirthState.XPath"), birthState);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage selectBirthCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.BirthCountry.XPath"), country);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage selectNationality(String nationality) {
		
		selectVisibileTextByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Nationality.XPath"), nationality);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnNoForPermanantResident() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.NoPermanantResident.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage clickOnNext() {
		
		clickByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.NextButton.XPath"));
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterStreetAddressLine1(String add1) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Address1.XPath"), add1);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterStreetAddressLine2(String add2) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Address2.XPath"), add2);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterCity(String city) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.City.XPath"), city);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterState(String state) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.State.XPath"), state);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterZipCode(String zip) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.ZipCode.XPath"), zip);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage enterPhoneNumber(String phnNo) {
		
		enterByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Phone.XPath"), phnNo);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.Country.XPath"), country);
		return this;
	}
	
	public OnlineUsVisaApplyHomePage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("OnlineUsVisaApplyHomePage.State.XPath"), state);
		return this;
	}
}
