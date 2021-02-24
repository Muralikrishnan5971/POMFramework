package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "IRCTC Book Hotel - GST Validation";
		testCaseDescription = "To Verify IRCTC gst number validation while hotel booking";
		app = "IRCTC";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
	}

	@Test
	public void IrctcBookHotelsGstValidation() {
		
		new HomePage(driver, test)
		.clickOkForAlert()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodationPage()
		.clickOnIrctcHotels()
		.switchToIrctcHotelsHomePage()
		.waitOnIrctcHotelsHomePage()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmailId("Student001@gmail.com")
		.enterMobileNumber("8870042518")
		.clickOnSubmit()
		.waitOnIrctcHotelsHomePage()
		.enterDestination("chennai")
		.clickOnCheckInDateField()
		.clickOnCheckInDate()
		.clickOnCheckOutDateField()
		.clickOnCheckOutDate()
		.clickOnRooms()
		.selectNoOfRooms("1")
		.selectNoOfAdults("2")
		.selectNoOfChild("1")
		.clickOnDone()
		.clickOnDest()
		.clickOnFindHotel()
		.waitOnIrctcHotelsHomePage()
		.clickOnFirstDisplayedHotel()
		.waitOnIrctcHotelsHomePage()
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueToBook()
		.selectTitle("Mr")
		.enterFirstName("Murali")
		.enterLastName("krishnan")
		.selectCountry("India")
		.selectState("PUDUCHERRY")
		.selectGstAsYes()
		.waitOnIrctcHotelsPassengerDetailsPage()
		.enterGstNumber("55877711111124548")
		.enterCompanyName("Testing Pvt Ltd")
		.enterCompanyAddress("Kamaraj Salai")
		.clickOnGoBtn()
		.verifyGstErrorMsg();
		
	}
}
