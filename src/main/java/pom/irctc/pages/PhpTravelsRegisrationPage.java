package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravelsRegisrationPage extends GenericWrappers {
	
	public PhpTravelsRegisrationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public PhpTravelsRegisrationPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.FirstName.XPath"), firstName);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.LastName.XPath"), lastName);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.Email.XPath"), emailId);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterPhoneNumber(String phnNo) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.Phone.XPath"), phnNo);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterCompanyName(String compName) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.CompanyName.XPath"), compName);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterStreetAdress1(String add1) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.Address1.XPath"), add1);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterStreetAdress2(String add2) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.Address2.XPath"), add2);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterCity(String city) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.City.XPath"), city);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterState(String state) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.State.XPath"), state);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterPostCode(String code) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.PostCode.XPath"), code);
		return this;
	}
	
	public PhpTravelsRegisrationPage selectCountry(String value) {
		
		selectValueByXpath(prop.getProperty("PhpTravelsRegisrationPage.Country.XPath"), value);
		return this;
	}
	
	public PhpTravelsRegisrationPage selectHowDidYouFindUs(String value) {
		
		selectVisibileTextByXpath(prop.getProperty("PhpTravelsRegisrationPage.HowFindUs.XPath"), value);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterMobileNo(String mobNo) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterPassword(String psw) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.Password.XPath"), psw);
		return this;
	}
	
	public PhpTravelsRegisrationPage enterConfirmPswd(String psw) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegisrationPage.ConfirmPassword.XPath"), psw);
		return this;
	}
	
	public PhpTravelsRegisrationPage clickOnRegister() {
		
		clickByXpath(prop.getProperty("PhpTravelsRegisrationPage.Register.XPath"));
		return this;
	}
}
