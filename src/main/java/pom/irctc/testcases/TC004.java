package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "IRCTC Book Hotel - OTP Validation";
		testCaseDescription = "To Verify IRCTC otp validation while hotel booking";
		app = "IRCTC";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
	}

	@Test
	public void IrctcBookHotelsOtpValidation() {
		
		new HomePage(driver, test)
		.clickOkForAlert()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodationPage()
		.clickOnIrctcHotels()
		.waitOnIrctcHotelsHomePage()
		.switchToIrctcHotelsHomePage()
		.clickOnLogin()
		.waitOnIrctcHotelsLoginPage()
		.clickOnGuestUserLogin()
		.enterEmailId("Student001@gmail.com")
		.enterMobileNumber("8870042518")
		.clickOnSubmit()
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
		.selectGstAsNo()
		.verifyHotelName()
		.verifyHotelPrice()
		.clickOnGoBtn()
		.clickOnIAgree()
		.clickOnMakePaymentBtn()
		.clickOnVerifyBtn()
		.verifyOtpErrorMsg();

	}
}
