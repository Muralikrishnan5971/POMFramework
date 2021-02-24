package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanIndiaApplicationPage extends GenericWrappers{
	
	public PanIndiaApplicationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}	

	public PanIndiaApplicationPage SelectTitle(String title) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.Title.XPath"), title);
		return this;
	}
	
	public PanIndiaApplicationPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.FirstName.XPath"), firstName);
		return this;
	}
	
	public PanIndiaApplicationPage enterMiddleName(String middleName) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.MiddleName.XPath"), middleName);
		return this;
	}
	
	public PanIndiaApplicationPage enterLastName(String lastName) {
	
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.LastName.XPath"), lastName);
		return this;
	}
	
	public PanIndiaApplicationPage enterFatherFirstName(String firstName) {
	
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.FatherFirstName.XPath"), firstName);
		return this;
	}
	
	public PanIndiaApplicationPage enterFatherMiddleName(String middleName) {
	
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.FatherMiddleName.XPath"), middleName);
		return this;
	}
	
	public PanIndiaApplicationPage enterFatherLastName(String lastName) {
	
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.FatherLastName.XPath"), lastName);
		return this;
	}
	
	public PanIndiaApplicationPage enterMobileNumber(String mobNo) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public PanIndiaApplicationPage enterEmailId(String email) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.Email.XPath"), email);
		return this;
	}
	
	public PanIndiaApplicationPage selectSourceOfIncome(String source) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.SourceOfIncome.XPath"), source);
		return this;
	}
	
	public PanIndiaApplicationPage clickOnResidence() {
		
		clickByXpath(prop.getProperty("PanIndiaApplicationPage.Residence.XPath"));
		return this;
	}
	
	public PanIndiaApplicationPage enterDateOfBirth(String dob) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.DateOfBirth.XPath"), dob);
		return this;
	}
	
	public PanIndiaApplicationPage scrollDownPage() {
		
		pageDown();
		return this;
	}
	public PanIndiaApplicationPage enterHouseNo(String houseNo) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.HouseNo.XPath"), houseNo);
		return this;
	}
	
	public PanIndiaApplicationPage enterArea(String area) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.Area.XPath"), area);
		return this;
	}
	
	public PanIndiaApplicationPage enterCity(String city) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.City.XPath"), city);
		return this;
	}
	
	public PanIndiaApplicationPage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.State.XPath"), state);
		return this;
	}
	
	public PanIndiaApplicationPage enterPinCode(String pinCode) {
		
		enterByXpath(prop.getProperty("PanIndiaApplicationPage.PinCode.XPath"), pinCode);
		return this;
	}
	
	public PanIndiaApplicationPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.Country.XPath"), country);
		return this;
	}
	
	public PanIndiaApplicationPage selectIdentityProof(String id) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.IdentityProof.XPath"), id);
		return this;
	}
	
	public PanIndiaApplicationPage selectAddressProof(String add) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.AddressProof.XPath"), add);
		return this;
	}
	
	public PanIndiaApplicationPage selectDobProof(String dob) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.DobProof.XPath"), dob);
		return this;
	}
	
	public PanIndiaApplicationPage selectAadhaarProof(String aadhaar) {
		
		selectVisibileTextByXpath(prop.getProperty("PanIndiaApplicationPage.AadhaarProof.XPath"), aadhaar);
		return this;
	}
	
	public PanIndiaApplicationPage clickOnIAgree() {
		
		clickByXpath(prop.getProperty("PanIndiaApplicationPage.IAgree.XPath"));
		return this;
	}

}
