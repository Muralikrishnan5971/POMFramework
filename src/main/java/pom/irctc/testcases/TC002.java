package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "IRCTC Book Your Coach";
		testCaseDescription = "To Verify IRCTC coach booking";
		app = "IRCTC";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
	}

	@Test
	public void IrctcBookYourCoach() {
		
		new HomePage(driver, test)
		.clickOkForAlert()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodationPage()
		.clickOnMenu()
		.clickOnBookYourCoachTrain()
		.switchToFtrServicesHomePage()
		.clickOnNewUserSignUp()
		.enterUserId("Muralikrishnan467")
		.enterPassword("Secret@12345")
		.enterConfirmPassword("Secret@12345")
		.selectSecurityQuestion("What was the name of your first school?")
		.enterSecurityAnswer("Petit Seminaire")
		.clickOnDateOfBirth()
		.selectMonth("Jul")
		.selectYear("1995")
		.clickOnDate()
		.clickOnMale()
		.clickOnUnMarried() 
		.enterEmailId("Student001@gmail.com")
		.selectOccupation("Student")
		.enterFirstName("Murali")
		.enterMiddleName("Max")
		.enterLastName("Krishnan")
		.selectNationality("Indian")
		.enterFlatNo("No 17")
		.enterStreet("Kamaraj Salai")
		.enterArea("MG Road")
		.selectCountry("India")
		.enterMobileNo("8870042519")
		.enterPinCode("605001")
		.waitOnFtrServicesCreateNewUserPage()
		.clickOnFtrServicesCreateNewUserPage()
		.selectCity("Pondicherry")
		.selectSate("PONDICHERRY")
		.selectPostOffice("Pondicherry H.O")
		.pageDownOnFtrServicesCreateNewUserPage()
		.pageDownOnFtrServicesCreateNewUserPage()
		.pageDownOnFtrServicesCreateNewUserPage()
		.pageDownOnFtrServicesCreateNewUserPage()
		.pageDownOnFtrServicesCreateNewUserPage()
		.clickOnNoRadioBtn()
		.enterOfficeFlatNo("No 18")
		.enterOfficeStreet("Mission Street")
		.enterOfficeArea("Saram")
		.selectOfficeCountry("India")
		.enterOfficeMobileNo("8561123548")
		.enterOfficePinCode("605001")
		.waitOnFtrServicesCreateNewUserPage()
		.clickOnFtrServicesCreateNewUserPage()
		.selectOfficeCity("Pondicherry")
		.selectOfficeSate("PONDICHERRY")
		.selectOfficePostOffice("Pondicherry H.O");
		
	}
}
