package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FacebookHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "FACEBOOK - Sign Up";
		testCaseDescription = "To Verify Facebook for a new user to sign up";
		app = "FB";
		browserName = "chrome";
		author = "Muralikrishnan";
		category = "smoke";
		sheetName = "TC007";
	}
	
	@Test(dataProvider="fetchData")
	public void FacebookSignUp(String firstName, String lastName, String emailID, 
          String confirmEmailid, String passWord, String birthDay, String birthMonth, String birthYear) {
		
		new FacebookHomePage(driver, test)
		.clickOnCreateNewAccount()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterMobileNoOrEmailId(emailID)
		.waitOnSignUpPage()
		.reEnterEmailId(confirmEmailid)
		.enterPassword(passWord)
		.selectBirthDay(birthDay)
		.selectBirthMonth(birthMonth)
		.selectBirthYear(birthYear)
		.clickOnMale()
		.clickOnSignUp();
		
	}

}
