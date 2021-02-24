package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "IRCTC Saloon Mandatory Check";
		testCaseDescription = "To Verify IRCTC saloon mandatory check";
		app = "IRCTC";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
	}

	@Test
	public void IrctcSaloonMandatoryCheck() {
		
		new HomePage(driver, test)
		.clickOkForAlert()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodationPage()
		.clickOnMenu()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterName("Muralikrishnan")
		.enterOrgName("Testing Pvt Ltd")
		.enterAddress("N0 17, MG Road")
		.entermobileNo("887004251")
		.enterEmailId("student@gmail.com")
		.selectSaloonCharter("Saloon Charter")
		.enterOriginationStation("Chennai")
		.enterDestinationStation("Pondy")
		.clickOnDateOfDepature()
		.clickDepatureDate()
		.clickOnDateOfArrival()
		.clickArrivalDate()
		.enterDurationOfTour("3")
		.enterCoachDetails("AC Sleeper")
		.enterNumberOfPassengers("3")
		.enterPurposeOfCharter("Good Services")
		.enterAdditionalServices("No additionional services required")
		.clickOnSubmit()
		.verifyMobileNoErrorMsg();
		
		
	}
}
