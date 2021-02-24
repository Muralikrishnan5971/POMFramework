package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PanIndiaApplicationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "PAN APPLY";
		testCaseDescription = "To Verify Pan card applicaion for a new user";
		app = "PAN";
		browserName = "chrome";
		author ="Muralikrishnan";
		category ="smoke";
		sheetName = "TC009"; 
	}
	
	@Test(dataProvider="fetchData")
	public void PanApply(String title, String firstName, String middleName, String lastName, String fatherFirstname, 
			String fatherMiddlename, String fatherLastname, String mobileNo, String emailId, String sourceofIncome, 
			String dob, String addLine01, String addLine02, String city, String state, String pinCode, String country, 
			String idProof, String addProof, String dobProof, String aadhaarProof) {
		
		new PanIndiaApplicationPage(driver, test)
		.SelectTitle(title)
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.enterFatherFirstName(fatherFirstname)
		.enterFatherMiddleName(fatherMiddlename)
		.enterFatherLastName(fatherLastname)
		.enterMobileNumber(mobileNo)
		.enterEmailId(emailId)
		.selectSourceOfIncome(sourceofIncome)
		.clickOnResidence()
		.enterDateOfBirth(dob)
		.scrollDownPage()
		.enterHouseNo(addLine01)
		.enterArea(addLine02)
		.enterCity(city)
		.selectState(state)
		.enterPinCode(pinCode)
		.selectCountry(country)
		.selectIdentityProof(idProof)
		.selectAddressProof(addProof)
		.selectDobProof(dobProof)
		.selectAadhaarProof(aadhaarProof)
		.clickOnIAgree();
		
	}
}
