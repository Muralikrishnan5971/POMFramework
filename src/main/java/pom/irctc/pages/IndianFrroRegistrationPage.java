package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IndianFrroRegistrationPage extends GenericWrappers {
	
	public IndianFrroRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public IndianFrroRegistrationPage enterUserId(String userId) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.UserId.XPath"), userId);
		return this;
	}
	
	public IndianFrroRegistrationPage enterPassword(String passwd) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Password.XPath"), passwd);
		return this;
	}

	public IndianFrroRegistrationPage enterConfirmPassword(String cfnPsw) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.ConfirmPassword.XPath"), cfnPsw);
		return this;
	}
	
	public IndianFrroRegistrationPage selectSecurityQuestion(String secQuest) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.SecurityQuestion.XPath"), secQuest);
		return this;
	}
	
	public IndianFrroRegistrationPage enterSecurityAnswer(String secAns) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.SecurityAnswer.XPath"), secAns);
		return this;
	}
	
	public IndianFrroRegistrationPage enterName(String name) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Name.XPath"), name);
		return this;
	}
	
	public IndianFrroRegistrationPage selectGender(String gender) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.Gender.XPath"), gender);
		return this;
	}
	
	public IndianFrroRegistrationPage enterDateOfBirth(String dob) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.DateOfBirth.XPath"), dob);
		return this;
	}
	
	public IndianFrroRegistrationPage enterDesignation(String designation) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Designation.XPath"), designation);
		return this;
	}
	
	public IndianFrroRegistrationPage enterEmaiId(String emailId) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Email.XPath"), emailId);
		return this;
	}
	
	public IndianFrroRegistrationPage enterMobileNumber(String mobNo) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public IndianFrroRegistrationPage enterPhoneNumber(String phoneNo) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Phone.XPath"), phoneNo);
		return this;
	}
	
	public IndianFrroRegistrationPage selectNationality(String nationality) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.Nationality.XPath"), nationality);
		return this;
	}
	
	public IndianFrroRegistrationPage enterHotelName(String name) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.HotelName.XPath"), name);
		return this;
	}
	
	public IndianFrroRegistrationPage enterCapacity(String capacity) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Capacity.XPath"), capacity);
		return this;
	}	
	
	public IndianFrroRegistrationPage enterAddress(String address) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.Address.XPath"), address);
		return this;
	}
	
	public IndianFrroRegistrationPage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.State.XPath"), state);
		return this;
	}
	
	public IndianFrroRegistrationPage selectCity(String city) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.City.XPath"), city);
		return this;
	}
	
	public IndianFrroRegistrationPage waitOnIndianFrroRegistrationPage() {
		
		waitProperty(3000);
		return this;
	}
	
	public IndianFrroRegistrationPage selectAccomodationType(String type) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.AccomodationType.XPath"), type);
		return this;
	}
	
	public IndianFrroRegistrationPage selectAccomodationGrade(String grade) {
		
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.AccomodationGrade.XPath"), grade);
		return this;
	}
	
	public IndianFrroRegistrationPage enterHotelEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.HotelEmail.XPath"), emailId);
		return this;
	}
	
	public IndianFrroRegistrationPage enterHotelMobileNumber(String mobNo) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.HotelMobile.XPath"), mobNo);
		return this;
	}
	
	public IndianFrroRegistrationPage enterHotelPhoneNumber(String phnNo) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.HotelPhone.XPath"), phnNo);
		return this;
	}
	
	public IndianFrroRegistrationPage enterPassengerName(String name) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerName.XPath"), name);
		return this;
	}
	
	public IndianFrroRegistrationPage enterPassengerAddress(String address) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerAddress.XPath"), address);
		return this;
	}
	
	public IndianFrroRegistrationPage selectPassengerState(String state) {
	
		selectVisibileTextByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerState.XPath"), state);
		return this;
	}
	
	public IndianFrroRegistrationPage selectPassengerCity(String city) {
				
		selectValueByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerCity.XPath"), city);
		return this;
	}
	
	public IndianFrroRegistrationPage enterPassengerEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerEmail.XPath"), emailId);
		return this;
	}
	
	public IndianFrroRegistrationPage enterPassengerPhoneNo(String phnNo) {
		
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerPhone.XPath"), phnNo);
		return this;
	}

	public IndianFrroRegistrationPage enterPassengerMobileNo(String mobNo) {
	
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.PassengerMobile.XPath"), mobNo);
		return this;
	}

	public IndianFrroRegistrationPage clickOnAdd() {
		
		clickByXpath(prop.getProperty("IndianFrroRegistrationPage.Add.XPath"));
		return this;
	}
	
}
