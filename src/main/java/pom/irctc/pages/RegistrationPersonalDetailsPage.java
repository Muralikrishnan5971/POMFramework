package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPersonalDetailsPage extends GenericWrappers {
	
	public RegistrationPersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPersonalDetailsPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("RegistrationPersonalDetailsPage.FirstName.XPath"), firstName);
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterMiddleName(String middleName) {
		
		enterByXpath(prop.getProperty("RegistrationPersonalDetailsPage.MiddleName.XPath"), middleName);
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("RegistrationPersonalDetailsPage.LastName.XPath"), lastName);
		return this;
	}

	public RegistrationPersonalDetailsPage clickOnSelectOccupation() {
		
		clickByXpath(prop.getProperty("RegistrationPersonalDetailsPage.Occupation.XPath"));
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnOccupationOption(String option) {
		
		clickByXpath("//span[text()='"+option+"']/parent::li");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnDateOfBirth() {
		
		clickByXpath(prop.getProperty("RegistrationPersonalDetailsPage.DateOfBirth.XPath"));
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPersonalDetailsPage.BirthMonth.XPath"), month);
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPersonalDetailsPage.BirthYear.XPath"), year);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnday(String day) {
		
		clickByXpath("//a[text()='"+day+"']/parent::td");
		return this;
	}
		
	public RegistrationPersonalDetailsPage clickOnUnMarriedRadioBtn() {
		
		clickByXpath(prop.getProperty("RegistrationPersonalDetailsPage.UnMarried.XPath"));
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPersonalDetailsPage.Country.XPath"), country);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnMaleBtn() {
		
		clickByXpath(prop.getProperty("RegistrationPersonalDetailsPage.MaleBtn.XPath"));
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("RegistrationPersonalDetailsPage.Email.XPath"), emailId);
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterMobileNo(String mobNo) {
		
		enterByXpath(prop.getProperty("RegistrationPersonalDetailsPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	
	public RegistrationPersonalDetailsPage selectNationality(String nation) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPersonalDetailsPage.Nationality.XPath"), nation);
		return this;
	}
	
	public RegistrationAddressPage clickOnContinue() {
		
		clickByXpath(prop.getProperty("RegistrationPersonalDetailsPage.Continue.XPath"));
		return new RegistrationAddressPage(driver, test);
	}
	
	
}
