package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "IRCTC Registration";
		testCaseDescription = "To Verify IRCTC New User Registration";
		app = "IRCTC";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
	}

	@Test
	public void IrctcRegistration() {
		
		 new HomePage(driver, test)
		 .clickOkForAlert()
		 .clickOnRegister()
		 .enterUserName("Muralikrishnan")
		 .enterPassword("SecretIndia_@123")
		 .enterConfirmPassword("SecretIndia_@123")
		 .clickOnPreferredLanguage()
		 .clickOnPreferredLanguageOption("English")
		 .clickOnSecurityQuestion()
		 .clickOnSecurityQuestionOption("What was the name of your first school?")
		 .clickOnContinue()
		 .enterFirstName("Murali")
		 .enterMiddleName("Max")
		 .enterLastName("krishnan")
		 .clickOnSelectOccupation()
		 .clickOnOccupationOption("STUDENT")
		 .clickOnDateOfBirth()
		 .selectMonth("July")
		 .selectYear("1995")
		 .clickOnday("1")
		 .clickOnUnMarriedRadioBtn()
		 .selectCountry("India")
		 .clickOnMaleBtn()
		 .enterEmailId("student@gmail.com")
		 .enterMobileNo("8870042519")
		 .selectNationality("India")
		 .clickOnContinue()
		 .enterFlatNo("No 17")
		 .enterStreet("Kamaraj Salai")
		 .enterArea("M G Road")
		 .enterPinCode("605001")
		 .enterState("Pondicherry")
		 .selectCity("Pondicherry")
		 .selectPostOffice("Pondicherry H.O")
		 .enterPhoneNo("2256674")
		 .clickOnYes()
		 .clickOnRegisterBtn();
		 
	 }
}
