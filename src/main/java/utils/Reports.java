package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reports {
	
	public static ExtentReports report;
	public ExtentTest test;

	public String testCaseName, testCaseDescription;
	public String author, category;
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public abstract long takeSnap();
	
	public void startReport() {
		
		report = new ExtentReports("./reports/results.html");
	}
	
	public void startTest(String testName, String description){
		
		test = report.startTest(testName, description);
	}
	
	public void reportStep(String status, String details) {
		
		long snapNum = takeSnap();
		
		if (status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details + test.addScreenCapture(".././reports/screenshots/" +snapNum+ ".png"));
			
		}else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details + test.addScreenCapture(".././reports/screenshots/" +snapNum+ ".png"));
			
		}else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details + test.addScreenCapture(".././reports/screenshots/" +snapNum+ ".png"));
			
		}else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details + test.addScreenCapture(".././reports/screenshots/" +snapNum+ ".png"));
			
		}
	}
	
	public void reportStep(String status, String details, boolean snap) {
		
		if(!snap) {
		
		if (status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details);
			
		}else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details);
			
		}else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details);
			
		}else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details);
		}
		}
	}
	
	public void assignAuthor(String authorName) {
		
		test.assignAuthor(authorName);
	}
	
	public void endTest() {
		
		report.endTest(test);
	}
	
	public void endReport() {
		
		report.flush();
	}
}
