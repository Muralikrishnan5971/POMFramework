package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.IndianFrroHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "INDIAN FRRO - Form C";
		testCaseDescription = "To Verify Indian Frro - From C for new user registration";
		app = "FRRO";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
		sheetName = "TC006";
	}

	@Test(dataProvider="fetchData")
	public void IndianFrro(String userName, String password, String confirmPassword, String secQuestion, String secAns, 
			String fullName, String gender, String dob, String designation, String emailId, String mobileNo, String phoneNo, 
			String nationality, String name, String capacity, String address, String state, String citydist, String accoType, 
			String starRating, String hotelEmailId, String  mobCont, String phoCont, String name01, String add01, String state01, 
			String city01, String email01, String phoneno01, String mobile01, String name02, String add02, String state02, 
			String city02, String email02, String phoneno02, String mobile02, String name03, String add03, String state03, 
			String city03, String email03, String phoneno03, String mobile03) {
		
		new IndianFrroHomePage(driver, test)
		.clickOnSignUpRegistration()
		.enterUserId(userName)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.selectSecurityQuestion(secQuestion)
		.enterSecurityAnswer(secAns)
		.enterName(fullName)
		.selectGender(gender)
		.enterDateOfBirth(dob)
		.enterDesignation(designation)
		.enterEmaiId(emailId)
		.enterMobileNumber(mobileNo)
		.enterPhoneNumber(phoneNo)
		.selectNationality(nationality)
		.enterHotelName(name)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.waitOnIndianFrroRegistrationPage()
		.selectCity(citydist)
		.selectAccomodationType(accoType)
		.selectAccomodationGrade(starRating)
		.enterHotelEmailId(hotelEmailId)
		.enterHotelMobileNumber(mobCont)
		.enterHotelPhoneNumber(phoCont)
		.enterPassengerName(name01)
		.enterPassengerAddress(add01)
		.selectPassengerState(state01)
		.selectPassengerCity(city01)
		.enterPassengerEmailId(email01)
		.enterPassengerPhoneNo(phoneno01)
		.enterPassengerMobileNo(mobile01)
		.clickOnAdd()
		.waitOnIndianFrroRegistrationPage()
		.enterPassengerName(name02)
		.enterPassengerAddress(add02)
		.selectPassengerState(state02)
		.selectPassengerCity(city02)
		.enterPassengerEmailId(email02)
		.enterPassengerPhoneNo(phoneno02)
		.enterPassengerMobileNo(mobile02)
		.clickOnAdd()
		.waitOnIndianFrroRegistrationPage()
		.enterPassengerName(name03)
		.enterPassengerAddress(add03)
		.selectPassengerState(state03)
		.selectPassengerCity(city03)
		.enterPassengerEmailId(email03)
		.enterPassengerPhoneNo(phoneno03)
		.enterPassengerMobileNo(mobile03);
		
		
	}
	
}
