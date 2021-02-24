package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PhpTravelsRegisrationPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "PHP Travels Registration";
		testCaseDescription = "To Verify Php travels new registration";
		app = "PHP";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
		sheetName = "TC010";
	}
	
	@Test(dataProvider="fetchData")
	public void PhpTravelsRegister(String firstName, String lastName, String emailId, String phoneNo, 
			String companyName, String addLine01, String addLine02, String city, String state, String pinCode, 
			String countryVal, String howDidYoufindus, String mobileNo, String passWord, String confirmPassword) {
		
		new PhpTravelsRegisrationPage(driver, test)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(emailId)
		.enterPhoneNumber(phoneNo)
		.enterCompanyName(companyName)
		.enterStreetAdress1(addLine01)
		.enterStreetAdress2(addLine02)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(pinCode)
		.selectCountry(countryVal)
		.selectHowDidYouFindUs(howDidYoufindus)
		.enterMobileNo(mobileNo)
		.enterPassword(passWord)
		.enterConfirmPswd(confirmPassword)
		.clickOnRegister();
	}

}
