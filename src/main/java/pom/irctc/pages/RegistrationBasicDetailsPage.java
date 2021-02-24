package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationBasicDetailsPage extends GenericWrappers {
	
	public RegistrationBasicDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public RegistrationBasicDetailsPage enterUserName(String name) {
		
		enterByXpath(prop.getProperty("RegistrationBasicDetailsPage.UserName.XPath"), name);
		return this;
	}
	
	public RegistrationBasicDetailsPage enterPassword(String pswd) {
		
		enterByXpath(prop.getProperty("RegistrationBasicDetailsPage.Password.XPath"), pswd);
		return this;
	}
	
	public RegistrationBasicDetailsPage enterConfirmPassword(String cnfpwd) {
		
		enterByXpath(prop.getProperty("RegistrationBasicDetailsPage.ConfirmPassword.XPath"), cnfpwd);
		return this;
	}
	
	
	public RegistrationBasicDetailsPage clickOnPreferredLanguage() {
		
		clickByXpath(prop.getProperty("RegistrationBasicDetailsPage.PreferredLanguage.XPath"));
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnPreferredLanguageOption(String language) {
		
		clickByXpath("//span[text()='"+language+"']/parent::li");
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnSecurityQuestion() {
		
		clickByXpath(prop.getProperty("RegistrationBasicDetailsPage.SecurityQuestion.XPath"));
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnSecurityQuestionOption(String option) {
		
		clickByXpath("//span[text()='"+option+"']/parent::li");
		return this;
	}
	
	public RegistrationBasicDetailsPage enterSecurityAnswer(String ans) {
		
		enterByXpath(prop.getProperty("RegistrationBasicDetailsPage.SecurityAnswer.XPath"), ans);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnContinue() {
		
		clickByXpath(prop.getProperty("RegistrationBasicDetailsPage.Continue.XPath"));
		return new RegistrationPersonalDetailsPage(driver, test);
	}
	
	
	
}
