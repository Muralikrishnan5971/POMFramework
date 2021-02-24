package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers {
	
	public FacebookSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FacebookSignUpPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), firstName);
		return this;
	}
	
	public FacebookSignUpPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.XPath"), lastName);
		return this;
	}
	
	public FacebookSignUpPage enterMobileNoOrEmailId(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.MobileOrEmail.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage waitOnSignUpPage() {
		
		waitProperty(2000);
		return this;
	}
	
	public FacebookSignUpPage reEnterEmailId(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.ReEnterEmail.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterPassword(String pswd) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), pswd);
		return this;
	}
	
	public FacebookSignUpPage selectBirthDay(String day) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.BirthDay.XPath"), day);
		return this;
	}
	
	public FacebookSignUpPage selectBirthMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.BirthMonth.XPath"), month);
		return this;
	}
	
	public FacebookSignUpPage selectBirthYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.BirthYear.XPath"), year);
		return this;
	}
	
	public FacebookSignUpPage clickOnMale() {
		
		clickByXpath(prop.getProperty("FacebookSignUpPage.MaleBtn.XPath"));
		return this;
	}
	
	public FacebookSignUpPage clickOnSignUp() {
		
		clickByXpath(prop.getProperty("FacebookSignUpPage.Submit.XPath"));
		return this;
	}

}
