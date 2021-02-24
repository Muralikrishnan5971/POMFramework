package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

import utils.Reports;

public class GenericWrappers extends Reports implements Wrappers {

	public RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			
			prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/objects.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void unLoadObjects() {
		
		prop = null;
	}
	
	public void invokeApp(String browser, String url, boolean remote) {
		// TODO Auto-generated method stub

		try {

			if(remote) {
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setPlatform(Platform.WINDOWS);
				dc.setBrowserName(browser);
				driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"), dc);
			}
			
			
			else if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_88.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			driver.get(url);

//			System.out.println("The browser " + browser + " is launched successfully with the given URL " + url);
			reportStep("pass", "The browser " + browser + " is launched successfully with the given URL " + url);

		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block

//			System.err.println("The browser " + browser + " not launched due to session id not created error");
			reportStep("fail", "The browser " + browser + " not launched due to session id not created error");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The browser " + browser + " not launched due to unknown error");
			reportStep("fail", "The browser " + browser + " not launched due to unknown error");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub

		try {

			driver.findElementById(idValue).sendKeys(data);

//			System.out.println("The element with id " + idValue + " is entered with data" + data);
			reportStep("pass", "The element with id " + idValue + " is entered with data " + data);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with id " + idValue + " is not found in the DOM");
			reportStep("fail", "The element with id " + idValue + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + idValue + " is not visible in the application");
			reportStep("fail", "The element with id " + idValue + " is not found in the DOM");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + idValue + " is not interactable in the appication");
			reportStep("fail", "The element with id " + idValue + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + idValue + " is not stable in the application");
			reportStep("fail", "The element with id " + idValue + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + idValue + " is not entered with data " + data + " due to unknown error");
			reportStep("fail", "The element with id " + idValue + " is not entered with data " + data + " due to unknown error");
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByName(nameValue).sendKeys(data);

//			System.out.println("The element with name " + nameValue + " is entered with data " + data);
			reportStep("pass", "The element with name " + nameValue + " is entered with data " + data);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with name " + nameValue + " is not found in the DOM");
			reportStep("fail", "The element with name " + nameValue + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + nameValue + " is not visible in the application");
			reportStep("fail", "The element with name " + nameValue + " is not visible in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + nameValue + " is not stable in the application");
			reportStep("fail", "The element with name " + nameValue + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + nameValue + " is not interactable in the application");
			reportStep("fail", "The element with name " + nameValue + " is not interactable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + nameValue + " is not entered with data "+data+" due to unknown error");
			reportStep("fail", "The element with name " + nameValue + " is not entered with data "+data+" due to unknown error");
		} 
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByXPath(xpathValue).sendKeys(data);

//			System.out.println("The element with xpath " + xpathValue + " is entered with the data " + data);
			reportStep("pass", "The element with xpath " + xpathValue + " is entered with the data " + data);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpathValue + " is not found in the DOM");
			reportStep("fail", "The element with xpath " + xpathValue + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathValue + " is not visible in the application");
			reportStep("fail", "The element with xpath " + xpathValue + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element wiht xpath " + xpathValue + " is not interactable in the application");
			reportStep("fail", "The element wiht xpath " + xpathValue + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathValue + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpathValue + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathValue + " is not entered with data "+data+" due to unknown error");
			reportStep("fail", "The element with xpath " + xpathValue + " is not entered with data "+data+" due to unknown error");

		} 
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub

		try {

			String actualtitle = driver.getTitle();

			if (actualtitle.equals(title)) {

//				System.out.println("The Actual title " + actualtitle + " is matched with the expected title " + title);
				reportStep("pass", "The Actual title " + actualtitle + " is matched with the expected title " + title);
				
			} else {

//				System.err.println("The Actual title " + actualtitle + " is not matched with the expected title " + title);
				reportStep("fail", "The Actual title " + actualtitle + " is not matched with the expected title " + title);
			}

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

//			System.err.println("The Actual title cannot be verified with the expected title " + title + " due to unknown error ");
			reportStep("fail", "The Actual title cannot be verified with the expected title " + title + " due to unknown error ");
			
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

		try {

			String actualtext = driver.findElementById(id).getText();

			if (actualtext.equals(text)) {

//				System.out.println("The Actual text " + actualtext + " of the element with id " + id
//						+ " is matched with the expected text " + text);
				reportStep("pass", "The Actual text " + actualtext + " of the element with id " + id
						+ " is matched with the expected text " + text);

			} else {

//				System.err.println("The Actual text " + actualtext + " of the element with id " + id
//						+ " is not matched with the expected text " + text);
				reportStep("fail", "The Actual text " + actualtext + " of the element with id " + id
						+ " is not matched with the expected text " + text);
			}

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with id " + id + " is not found in the DOM");
			reportStep("fail", "The element with id " + id + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not visible in the application");
			reportStep("fail", "The element with id " + id + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not interactable in the application");
			reportStep("fail", "The element with id " + id + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not stable in the application");
			reportStep("fail", "The element with id " + id + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The text of the element with id " + id + " cannot be retrieved due to unknown error");
			reportStep("fail", "The text of the element with id " + id + " cannot be retrieved due to unknown error");
			
		} 
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

		try {

			String actualtext = driver.findElementByXPath(xpath).getText();

			if (actualtext.equals(text)) {

//				System.out.println("The Actual text " + actualtext + " of the element with xpath " + xpath
//						+ " is matched with the expected text " + text);
				reportStep("pass", "The Actual text " + actualtext + " of the element with xpath " + xpath
						+ " is matched with the expected text " + text);

			} else {

//				System.err.println("The Actual text " + actualtext + " of the element with xpath " + xpath
//						+ " is not matched with the expected text " + text);
				reportStep("fail", "The Actual text " + actualtext + " of the element with xpath " + xpath
						+ " is not matched with the expected text " + text);
			}

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpath + " is not found in the DOM");
			reportStep("fail", "The element with xpath " + xpath + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not visible in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not interactable in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

			System.err.println("The element with xpath " + xpath + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The text of the element with xpath " + xpath + " cannot be retrieved due to unknown error");
			reportStep("fail", "The text of the element with xpath " + xpath + " cannot be retrieved due to unknown error");
			
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

		try {

			String actualtext = driver.findElementByXPath(xpath).getText();

			if (actualtext.contains(text)) {

//				System.out.println("The Actual text " + actualtext + " of the element with xpath " + xpath
//						+ " is matched with the expected text " + text);
				reportStep("pass", "The Actual text " + actualtext + " of the element with xpath " + xpath
						+ " is matched with the expected text " + text);

			} else {

//				System.err.println("The Actual text " + actualtext + " of the element with xpath " + xpath
//						+ " is not matched with the expected text " + text);
				reportStep("fail", "The Actual text " + actualtext + " of the element with xpath " + xpath
						+ " is not matched with the expected text " + text);
			}

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpath + " is not found in the DOM");
			reportStep("fail", "The element with xpath " + xpath + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not visible in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not interactable in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The text of the element with xpath " + xpath + " cannot be retrieved due to unknown error");
			reportStep("fail", "The text of the element with xpath " + xpath + " cannot be retrieved due to unknown error");

		} 
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub

		try {

			driver.findElementById(id).click();

//			System.out.println("The element with id " + id + " is successfully clicked");
			reportStep("pass", "The element with id " + id + " is successfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with id " + id + " is not found in the DOM");
			reportStep("fail", "The element with id " + id + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element wiht id " + id + " is not visible in the application");
			reportStep("fail", "The element wiht id " + id + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " cannot be clicked in the application");
			reportStep("fail", "The element with id " + id + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not interactable in the application");
			reportStep("fail", "The element with id " + id + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element wiht id " + id + " is not stable in the application");
			reportStep("fail", "The element with id " + id + " is not interactable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with id " + id + " cannot be clicked due to unknown error");

		} 
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByClassName(classVal).click();

//			System.out.println("The element with class name " + classVal + " is successfully clicked");
			reportStep("pass", "The element with class name " + classVal + " is successfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with class name " + classVal + " is not found in the DOM");
			reportStep("fail", "The element with class name " + classVal + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with class name " + classVal + " is not visible in the application");
			reportStep("fail", "The element with class name " + classVal + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with class name " + classVal + " cannot be clicked in the application");
			reportStep("fail", "The element with class name " + classVal + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with class name " + classVal + " is not interactable in the application");
			reportStep("fail", "The element with class name " + classVal + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with class name " + classVal + " is not stable in the application");
			reportStep("fail", "The element with class name " + classVal + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with class name " + classVal + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with class name " + classVal + " cannot be clicked due to unknown error");

		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByName(name).click();

//			System.out.println("The element with name " + name + " is succesfully clicked");
			reportStep("pass", "The element with name " + name + " is succesfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with name " + name + " is not found in the DOM");
			reportStep("fail", "The element with name " + name + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not visible in the application");
			reportStep("fail", "The element with name " + name + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " cannot be clicked in the application");
			reportStep("fail", "The element with name " + name + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not interactable in the application");
			reportStep("fail", "The element with name " + name + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not stable in the application");
			reportStep("fail", "The element with name " + name + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with name " + name + " cannot be clicked due to unknown error");

		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByLinkText(name).click();

//			System.out.println("The element with link text " + name + " is succesfully clicked");
			reportStep("pass", "The element with link text " + name + " is succesfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with link text " + name + " is not found in the DOM");
			reportStep("fail", "The element with link text " + name + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " is not visible in the application");
			reportStep("fail", "The element with link text " + name + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " cannot be clicked in the application");
			reportStep("fail", "The element with link text " + name + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " is not interactable in the application");
			reportStep("fail", "The element with link text " + name + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " is not stable in the application");
			reportStep("fail", "The element with link text " + name + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with link text " + name + " cannot be clicked due to unknown error");
		} 
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByLinkText(name).click();

//			System.out.println("The element with link text " + name + " is succesfully clicked");
			reportStep("pass", "The element with link text " + name + " is succesfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with link text " + name + " is not found in the DOM");
			reportStep("fail", "The element with link text " + name + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " is not visible in the application");
			reportStep("fail", "The element with link text " + name + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " cannot be clicked in the application");
			reportStep("fail", "The element with link text " + name + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " is not interactable in the application");
			reportStep("fail", "The element with link text " + name + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " is not stable in the application");
			reportStep("fail", "The element with link text " + name + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with link text " + name + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with link text " + name + " cannot be clicked due to unknown error");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByXPath(xpathVal).click();

//			System.out.println("The element with xpath " + xpathVal + " is successfully clicked");
			reportStep("pass", "The element with xpath " + xpathVal + " is successfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpathVal + " is not present in the DOM");
			reportStep("fail", "The element with xpath " + xpathVal + " is not present in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " is not visible in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " cannot be clicked in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " is not interactable in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with xpath " + xpathVal + " cannot be clicked due to unknown error");

		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

		try {

			driver.findElementByXPath(xpathVal).click();

//			System.out.println("The element with xpath " + xpathVal + " is successfully clicked");
			reportStep("pass", "The element with xpath " + xpathVal + " is successfully clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpathVal + " is not present in the DOM");
			reportStep("fail", "The element with xpath " + xpathVal + " is successfully clicked");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " is not visible in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " is not visible in the application");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " cannot be clicked in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " cannot be clicked in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " is not interactable in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpathVal + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpathVal + " cannot be clicked due to unknown error");
			reportStep("fail", "The element with xpath " + xpathVal + " cannot be clicked due to unknown error");
		}

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub

		String elementText = null;

		try {

			elementText = driver.findElementById(idVal).getText();

//			System.out.println("The text of the element with Id " + idVal + " is sccuessfully retrieved as " + elementText);
			reportStep("pass", "The text of the element with Id " + idVal + " is sccuessfully retrieved as " + elementText);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.out.println("The element with Id " + idVal + " is not found in the DOM");
			reportStep("fail", "The element with Id " + idVal + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with Id " + idVal + " is not visible in the application");
			reportStep("fail", "The element with Id " + idVal + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with Id " + idVal + " is not interactable in the application");
			reportStep("fail", "The element with Id " + idVal + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with Id " + idVal + " is not stable in the application");
			reportStep("fail", "The element with Id " + idVal + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The text of the element with Id " + idVal + " cannot be retrieved due to unknown error");
			reportStep("fail", "The text of the element with Id " + idVal + " cannot be retrieved due to unknown error");

		}

		return elementText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub

		String elementText = null;

		try {

			elementText = driver.findElementByXPath(xpathVal).getText();

//			System.out.println("The text of the element with Xpath " + xpathVal + " is sccuessfully retrieved as " + elementText);
			reportStep("pass", "The text of the element with Xpath " + xpathVal + " is sccuessfully retrieved as " + elementText);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with Xpath " + xpathVal + " is not found in the DOM");
			reportStep("fail", "The element with Xpath " + xpathVal + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with Xpath " + xpathVal + " is not visible in the application");
			reportStep("fail", "The element with Xpath " + xpathVal + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with Xpath " + xpathVal + " is not interactable in the application");
			reportStep("fail", "The element with Xpath " + xpathVal + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with Xpath " + xpathVal + " is not stable in the application");
			reportStep("fail", "The element with Xpath " + xpathVal + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The text of the element with Xpath " + xpathVal + " cannot be retrieved due to unknown error");
			reportStep("fail", "The text of the element with Xpath " + xpathVal + " cannot be retrieved due to unknown error");

		}

		return elementText;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementById(id));
			select.selectByVisibleText(value);

//			System.out.println("The element with id " + id + " along with visible text " + value + " is selected successfully");
			reportStep("pass", "The element with id " + id + " along with visible text " + value + " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with id " + id + " is not found in the dOM");
			reportStep("fail", "The element with id " + id + " is not found in the dOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not visible in the application");
			reportStep("fail", "The element with id " + id + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not interactable in the appication");
			reportStep("fail", "The element with id " + id + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not stable in the application");
			reportStep("fail", "The element with id " + id + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " along with visible text " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with id " + id + " along with visible text " + value
					+ " cannot be selected due to unknown error");

		} 
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementById(id));
			select.selectByIndex(value);

//			System.out.println("The element with id " + id + " along with index value " + value + " is selected successfully");
			reportStep("pass", "The element with id " + id + " along with index value " + value + " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with id " + id + " is not found in the DOM");
			reportStep("fail", "The element with id " + id + " is not found in the DOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element wiht id " + id + " is not visible in the application");
			reportStep("fail", "The element wiht id " + id + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not interactable in the application");
			reportStep("fail", "The element with id " + id + " is not interactable in the application");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element wiht id " + id + " is not stable in the application");
			reportStep("fail", "The element wiht id " + id + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " along with index value " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with id " + id + " along with index value " + value
					+ " cannot be selected due to unknown error");
			
		}

	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub

		try {

			Set<String> windowId = driver.getWindowHandles();

			for (String eachId : windowId) {

				driver.switchTo().window(eachId);

//				System.out.println("The driver control is successfully switched to Parent Window with window Id " + eachId);
				reportStep("pass", "The driver control is successfully switched to Parent Window with window Id " + eachId);

				break;
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block

//			System.err.println("Driver control cannot be switched because Parent window is not present");
			reportStep("fail", "Driver control cannot be switched because Parent window is not present");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("Driver control cannot be switched to Parent window due to unknown error");
			reportStep("fail", "Driver control cannot be switched to Parent window due to unknown error");

		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

		try {

			Set<String> winId = driver.getWindowHandles();

			for (String eachId : winId) {

				driver.switchTo().window(eachId);
			}

			String lastWin = driver.getWindowHandle();

//			System.out.println("The driver control is successfully switched to the last Window with window Id " + lastWin);
			reportStep("pass", "The driver control is successfully switched to the last Window with window Id " + lastWin);

		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block

//			System.err.println("Driver control cannot be switched because last window is not present");
			reportStep("fail", "Driver control cannot be switched because last window is not present");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("Driver control cannot be switched to last window due to unknown error");
			reportStep("fail", "Driver control cannot be switched to last window due to unknown error");

		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

		try {

			driver.switchTo().alert().accept();

//			System.out.println("The driver control is switched to the alert and accepted successfully ");
			reportStep("pass", "The driver control is switched to the alert and accepted successfully ");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block

//			System.err.println("No such alert is present");
			reportStep("fail", "No such alert is present");

		} catch (UnhandledAlertException e) {
			// TODO: handle exception

//			System.err.println("The alert present is not handled");
			reportStep("fail", "The alert present is not handled");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The alert cannot be accepted due to unknown error");
			reportStep("fail", "The alert cannot be accepted due to unknown error");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

		try {

			driver.switchTo().alert().dismiss();
			
//			System.out.println("The alert is successfully dismissed");
			reportStep("pass", "The alert is successfully dismissed");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block

//			System.err.println("No such alert is present");
			reportStep("fail", "No such alert is present");

		} catch (UnhandledAlertException e) {
			// TODO: handle exception

//			System.err.println("The alert present is not handled");
			reportStep("fail", "The alert present is not handled");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The alert cannot be dismissed due to unknown error");
			reportStep("fail", "The alert cannot be dismissed due to unknown error");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub

		String alertText = null;

		try {

			alertText = driver.switchTo().alert().getText();

//			System.out.println("The Alert text is successfully as " + alertText);
			reportStep("pass", "The Alert text is successfully as " + alertText);

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block

//			System.err.println("No such alert is present");
			reportStep("fail", "No such alert is present");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The alert text cannot be retrieved due to unknown error");
			reportStep("fail", "The alert text cannot be retrieved due to unknown error");
		}
		
		return alertText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub

		long number = 1;
		
		try {

			number = (long) (Math.floor(Math.random()*10000000)+100000);
			
			File src = driver.getScreenshotAs(OutputType.FILE);

			File dest = new File("./reports/screenshots/" +number+ ".png");

			FileUtils.copyFile(src, dest);

		} catch (IOException e) {
			// TODO Auto-generated catch block

//			System.err.println("Screenshot cannot be taken due to Input/Output error");
			reportStep("fail", "Screenshot cannot be taken due to Input/Output error");

		} catch (ScreenshotException e) {
			// TODO Auto-generated catch block

//			System.err.println("Screenshot cannot be taken");
			reportStep("fail", "Screenshot cannot be taken");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("Screenshot cannot be taken due to unknown error");
			reportStep("fail", "Screenshot cannot be taken due to unknown error");

		}

		return number;

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub

		try {

			driver.close();

//			System.out.println("The current window is closed sucessfully");
			reportStep("pass", "The current window is closed sucessfully", false);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

//			System.err.println("The browser cannot be closed due to unknown error");
			reportStep("fail", "The browser cannot be closed due to unknown error", false);
		}

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

		try {

			driver.quit();

//			System.out.println("All the windows present are closed successfully");
			reportStep("pass", "All the windows present are closed successfully", false);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

//			System.err.println("All the browsers cannot be closed due to unkown error");
			reportStep("fail", "All the browsers cannot be closed due to unkown error", false);

		}

	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {

			Thread.sleep(time);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

//			System.err.println("Wait for " + time + " milliseconds cannot be given due to interrupted exception");
			reportStep("fail", "Wait for " + time + " milliseconds cannot be given due to interrupted exception", false);

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("Wait for " + time + " milliseconds cannot be given due to unknown error");
			reportStep("fail", "Wait for " + time + " milliseconds cannot be given due to unknown error", false);

		}
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementByXPath(xpath));

			select.selectByVisibleText(value);

//			System.out.println("The element with xpath " + xpath + " along with visible text " + value
//					+ " is selected successfully");
			reportStep("pass", "The element with xpath " + xpath + " along with visible text " + value
					+ " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpath + " is not found in the dOM");
			reportStep("fail", "The element with xpath " + xpath + " is not found in the dOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not visible in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not interactable in the appication");
			reportStep("fail", "The element with xpath " + xpath + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " along with visible text " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with xpath " + xpath + " along with visible text " + value
					+ " cannot be selected due to unknown error");
		}
	}

	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementByName(name));
			select.selectByVisibleText(value);

//			System.out.println("The element with name " + name + " along with visible text " + value
//					+ " is selected successfully");
			reportStep("pass", "The element with name " + name + " along with visible text " + value
					+ " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with name " + name + " is not found in the dOM");
			reportStep("fail", "The element with name " + name + " is not found in the dOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not visible in the application");
			reportStep("fail", "The element with name " + name + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not interactable in the appication");
			reportStep("fail", "The element with name " + name + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not stable in the application");
			reportStep("fail", "The element with name " + name + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " along with visible text " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with name " + name + " along with visible text " + value
					+ " cannot be selected due to unknown error");
		}
	}

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementByName(name));
			select.selectByValue(value);

//			System.out.println("The element with name " + name + " along with value " + value + " is selected successfully");
			reportStep("pass", "The element with name " + name + " along with value " + value + " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with name " + name + " is not found in the dOM");
			reportStep("fail", "The element with name " + name + " is not found in the dOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not visible in the application");
			reportStep("fail", "The element with name " + name + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not interactable in the appication");
			reportStep("fail", "The element with name " + name + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " is not stable in the application");
			reportStep("fail", "The element with name " + name + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with name " + name + " along with value " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with name " + name + " along with value " + value
					+ " cannot be selected due to unknown error");

		}
	}

	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementById(id));
			select.selectByValue(value);

//			System.out.println("The element with id " + id + " along with value " + value + " is selected successfully");
			reportStep("pass", "The element with id " + id + " along with value " + value + " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with id " + id + " is not found in the dOM");
			reportStep("fail", "The element with id " + id + " is not found in the dOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not visible in the application");
			reportStep("fail", "The element with id " + id + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not interactable in the appication");
			reportStep("fail", "The element with id " + id + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " is not stable in the application");
			reportStep("fail", "The element with id " + id + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with id " + id + " along with value " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with id " + id + " along with value " + value
					+ " cannot be selected due to unknown error");

		} 

	}

	public String getTitle() {
		// TODO Auto-generated method stub

		String title = null;

		try {

			title = driver.getTitle();

//			System.out.println("The Title " + title + " of the current URL is successfully retrieved " + title);
			reportStep("pass", "The Title " + title + " of the current URL is successfully retrieved " + title);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

//			System.err.println("The Title of the current URL cannot be retrieved due to unknown error");
			reportStep("fail", "The Title of the current URL cannot be retrieved due to unknown error");

		}

		return title;
	}

	public void pageDown() {
		// TODO Auto-generated method stub

		try {

			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);

//			System.out.println("The page is successfully scrolled down");
			reportStep("pass", "The page is successfully scrolled down", false);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

//			System.err.println("The page cannnot be scrolled down due to unknown reason");
			reportStep("fail", "The page cannnot be scrolled down due to unknown reason", false);

		}
	}

	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub

		try {

			Select select = new Select(driver.findElementByXPath(xpath));
			select.selectByValue(value);

//			System.out.println("The element with xpath " + xpath + " along with value " + value + " is selected successfully");
			reportStep("pass", "The element with xpath " + xpath + " along with value " + value + " is selected successfully");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

//			System.err.println("The element with xpath " + xpath + " is not found in the dOM");
			reportStep("fail", "The element with xpath " + xpath + " is not found in the dOM");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception

//			System.err.println("The element with xapth " + xpath + " is not visible in the application");
			reportStep("fail", "The element with xapth " + xpath + " is not visible in the application");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not interactable in the appication");
			reportStep("fail", "The element with xpath " + xpath + " is not interactable in the appication");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " is not stable in the application");
			reportStep("fail", "The element with xpath " + xpath + " is not stable in the application");

		} catch (WebDriverException e) {
			// TODO: handle exception

//			System.err.println("The element with xpath " + xpath + " along with value " + value
//					+ " cannot be selected due to unknown error");
			reportStep("fail", "The element with xpath " + xpath + " along with value " + value
					+ " cannot be selected due to unknown error");

		}
	}

	public void mouseHoverTo(String xpath) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElementByXPath(xpath);
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
//		System.out.println("The mouse pointer succesfully hovered to the specified WebElement");
		reportStep("pass", "The mouse pointer succesfully hovered to the specified WebElement");
	}

	
	public void pageDownArrow() {
		// TODO Auto-generated method stub
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.ARROW_DOWN);

//		System.out.println("The page is successfully scrolled down");
		reportStep("pass", "The page is successfully scrolled down", false);
		
	}

}
 