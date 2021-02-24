package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.OnlineUsVisaApplyHomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "US VISA APPLY";
		testCaseDescription = "To Verify Online US Visa application for a new user";
		app = "USVISA";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
		sheetName = "TC008";
	}

	@Test(dataProvider="fetchData")
	public void OnlineUsVisaAppy(String givenName, String surName, String nativeName, String otherGivenName,
			String otherSurname, String emaiId, String confirmEmailid, String addditionalEmailid, String birthYear, 
			String birthMonth, String birthCity, String birthState, String birthCountry, String nationality, 
			String streetLine01, String streetLine02, String city, String state, String zipCode, String mobileNo, 
			String country, String region) {
		
		new OnlineUsVisaApplyHomePage(driver, test)
		.enterGivenName(givenName)
		.enterSurName(surName)
		.enterFullName(nativeName)
		.scrollUsVisaApplyHomePagePageDown()
		.waitOnUsVisaApplyPage()
		.clickOnYesForOtherNames()
		.enterOtherGivenName(otherGivenName)
		.enterOtherSurName(otherSurname)
		.enterEmailId(emaiId)
		.enterConfirmEmailId(confirmEmailid)
		.clickOnYesForOtherEmailAddress()
		.enterAdditionalEmailAddress(addditionalEmailid)
		.clickOnMale()
		.clickOnDateOfBirth()
		.selectBirthYear(birthYear)
		.selectBirthMonth(birthMonth)
		.clickOnBirthDate()
		.enterCityOfBirth(birthCity)
		.enterBirthState(birthState)
		.selectBirthCountry(birthCountry)
		.selectNationality(nationality)
		.scrollUsVisaApplyHomePagePageDown()
		.waitOnUsVisaApplyPage()
		.clickOnNoForPermanantResident()
		.clickOnNext()
		.enterStreetAddressLine1(streetLine01)
		.enterStreetAddressLine2(streetLine02)
		.enterCity(city)
		.enterState(state)
		.enterZipCode(zipCode)
		.enterPhoneNumber(mobileNo)
		.selectCountry(country)
		.selectState(region);
		
		
	}
}
