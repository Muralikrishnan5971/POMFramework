package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsPassengerDetailsPage extends GenericWrappers {
	
	public IrctcHotelsPassengerDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public IrctcHotelsPassengerDetailsPage selectTitle(String title) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.Title.XPath"), title);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.FirstName.XPath"), firstName);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.LastName.XPath"), lastName);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.Country.XPath"), country);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.State.XPath"), state);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterMobileNumber(String mobNo) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.Mobile.XPath"), mobNo);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.Email.XPath"), emailId);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage selectGstAsNo() {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.Gst.XPath"), "No");
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage selectGstAsYes() {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.Gst.XPath"), "Yes");
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage waitOnIrctcHotelsPassengerDetailsPage() {
		
		waitProperty(3000);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage verifyHotelName() {
		
		verifyTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.VerifyHotelName.XPath"), "Oga AGP Lodge");
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage verifyHotelPrice() {
		
		verifyTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.VerifyHotelPrice.XPath"), "700.00");
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage clickOnGoBtn() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.GoButton.XPath"));
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage clickOnIAgree() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.IAgreeButton.XPath"));
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage clickOnMakePaymentBtn() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.MakePayment.XPath"));
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage clickOnVerifyBtn() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.VerifyButton.XPath"));
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage verifyOtpErrorMsg() {
		
		verifyTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.OtpErrorMsg.XPath"), "otp field is required.");
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterGstNumber(String gstNo) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.GstNumber.XPath"), gstNo);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterCompanyName(String compName) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.CompanyNumber.XPath"), compName);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage enterCompanyAddress(String compAdd) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.CompanyAddress.XPath"), compAdd);
		return this;
	}
	
	public IrctcHotelsPassengerDetailsPage verifyGstErrorMsg() {
		
		verifyTextByXpath(prop.getProperty("IrctcHotelsPassengerDetailsPage.GstErrorMsg.XPath"), "Please Enter Valid GSt number");
		return this;
	}
	
}
