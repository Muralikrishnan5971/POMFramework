package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DP;

public class ProjectWrappers extends GenericWrappers{
	
	public String browserName;
	public String app;
	public String sheetName;
	
	@BeforeSuite
	public void beforeSuite() {
		
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		
		loadObjects();
	}
	
	//@BeforeClass
	
	@BeforeMethod
	public void launchApp() {

			startTest(testCaseName, testCaseDescription);
			assignAuthor(author);
			
			switch(app) {
			
			case "IRCTC":
				invokeApp(browserName, "https://www.irctc.co.in/nget/train-search", false);
				break;
			
			case "FRRO":
				invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp", false);
				break;
				
			case "FB":
				invokeApp(browserName, "http://www.facebook.com", false);
				break;
				
			case "USVISA":
				invokeApp(browserName, "https://www.onlineusvisa.com/basic-details/in?origin=home&country=in&type=N#", false);
				break;
				
			case "PAN":
				invokeApp(browserName, "https://panind.com/india/new_pan/", false);
				break;
				
			case "PHP":
				invokeApp(browserName, "https://phptravels.org/register.php", false);
				break;
			
			}
	}

	@AfterMethod
	public void closeApp() {
		
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		
		unLoadObjects();
	}
	
	@AfterSuite
	public void afterSuite() {
		
		endReport();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() {
		
		return DP.getSheet(sheetName);
	}
	
	
}
