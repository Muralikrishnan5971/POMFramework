 package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrServicesCreateNewUserPage extends GenericWrappers {
	
	public FtrServicesCreateNewUserPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FtrServicesCreateNewUserPage enterUserId(String userId) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.UserId.XPath"), userId);
		return this;
	}

	public FtrServicesCreateNewUserPage enterPassword(String pswd) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Password.XPath"), pswd);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterConfirmPassword(String cnfmPswd) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.confirmPsw.XPath"), cnfmPswd);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectSecurityQuestion(String question) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.SecurityQuestion.XPath"), question);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterSecurityAnswer(String secAns) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.SecurityAns.XPath"), secAns);
		return this;
	}
	
	public FtrServicesCreateNewUserPage clickOnDateOfBirth() {
		
		clickByXpath(prop.getProperty("FtrServicesCreateNewUserPage.DateOfBirth.XPath"));
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Month.XPath"), month);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Year.XPath"), year);
		return this;
	}
	
	public FtrServicesCreateNewUserPage clickOnDate() {
		
		clickByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Date.XPath"));
		return this;
	}
	
	public FtrServicesCreateNewUserPage clickOnMale() {
		
		clickByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Male.XPath"));
		return this;
	}
	
	public FtrServicesCreateNewUserPage clickOnUnMarried() {
		
		clickByXpath(prop.getProperty("FtrServicesCreateNewUserPage.UnMarried.XPath"));
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Email.XPath"), emailId);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectOccupation(String option) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Occupation.XPath"), option);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.FirstName.XPath"), firstName);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterMiddleName(String middleName) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.MiddleName.XPath"), middleName);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.LastName.XPath"), lastName);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectNationality(String nationality) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Nationality.XPath"), nationality);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterFlatNo(String flatNo) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.FlatNo.XPath"), flatNo);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterStreet(String street) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Street.XPath"), street);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterArea(String area) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Area.XPath"), area);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Country.XPath"), country);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterMobileNo(String mobNo) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterPinCode(String pinCode) {
				
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.PinCode.XPath"), pinCode);
		return this;
	}
	
	public FtrServicesCreateNewUserPage waitOnFtrServicesCreateNewUserPage() {
		
		waitProperty(3000);
		return this;
	}
	
	public FtrServicesCreateNewUserPage clickOnFtrServicesCreateNewUserPage() {
		
		clickByXpath("//html/body");
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectCity(String city) {

		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.City.XPath"), city);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectSate(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.State.XPath"), state);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectPostOffice(String postOff) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.PostOffice.XPath"), postOff);
		return this;
	}
	
	public FtrServicesCreateNewUserPage pageDownOnFtrServicesCreateNewUserPage() {
		
		pageDown();
		return this;
	}
	
	public FtrServicesCreateNewUserPage clickOnNoRadioBtn() {
		
		clickByXpath(prop.getProperty("FtrServicesCreateNewUserPage.NoButton.XPath"));
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterOfficeFlatNo(String flatNo) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeFlatNo.XPath"), flatNo);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterOfficeStreet(String street) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeStreet.XPath"), street);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterOfficeArea(String area) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeArea.XPath"), area);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectOfficeCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeCountry.XPath"), country);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterOfficeMobileNo(String mobNo) {
		
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeMobile.XPath"), mobNo);
		return this;
	}
	
	public FtrServicesCreateNewUserPage enterOfficePinCode(String pinCode) {
				
		enterByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficePinCode.XPath"), pinCode);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectOfficeCity(String city) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeCity.XPath"), city);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectOfficeSate(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficeState.XPath"), state);
		return this;
	}
	
	public FtrServicesCreateNewUserPage selectOfficePostOffice(String postOff) {
		
		selectVisibileTextByXpath(prop.getProperty("FtrServicesCreateNewUserPage.OfficePostOffice.XPath"), postOff);
		return this;
	}
	
}
