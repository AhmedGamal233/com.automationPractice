package comAutomationPracticeTests;


import Actions.Helper;
import Logging.LoggingHandling;
import comAutomationPracticePages.*;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageFactory.PageFactoryClass;

/**
 * BaseTest class holds the methods to initialize and terminate the WebDriver object.
 * BaseTest is the main class which takes care of Browser setup, reusable methods like screenshot
 */
public class BaseTest {
	
protected WebDriver browserObject;
protected AddressCheckingPage addressCheckingPage;
protected AuthenticationPage authenticationPage;
protected BlousePage blousePage;
protected LandingPage landingPage;
protected OrderConfirmationPage orderConfirmationPage;
protected WomenCategoryPage womenCategoryPage;
protected OrderFinalDetailsPage orderFinalDetailsPage;
protected OrderHistoryPage orderHistoryPage;
protected PaymentPage paymentPage;
protected ProductDetailsPage productDetailsPage;
protected RegistrationPage registrationPage;
protected ShippingPage shippingPage;
protected SummaryPage summaryPage;
protected TopsPage topsPage;
protected PageFactoryClass pageFactoryClass;




	/**
	 * Note: you must run from testngSuite.xml right click on it and run testNG suite
	 */


	/**
	 *This method is responsible for :
	 * 0-initiate log file
	 * 1-select browser type (Firefox(FF)|Chrome(CH)|Internet Explorer(IE)) if tests run on same machine
	 * 2-select selenium Grid option if you want to run tests  multiple tests simultaneously on different browsers and platforms
	 * 3-instantiate Pages Objects
	 * 4-maximize Window browser
	 * NOTE:there is an issue in Internet explorer that interact with elements is  very slow when running script in IE browser
	 * 			     1-Open Internet Explorer
	 *               2-Go to Tools menu – Internet Options
	 *               3-Select Security Tab
	 *               4-In Select a zone to view or change security settings choose Internet and select the check box of Enable protected mode (requires restarting Internet Explorer).
	 *               Similarly, select the check box of Enable protected mode (requires restarting Internet Explorer) for other three such as Local Intranet, Trusted sites, and Restricted sites.
	 *   OR remove comment of line
	 *   Note: Don't use "introduceFlakinessByIgnoringSecurityDomains" setting even though the protected mode settings are configured correctly and you have necessary access for the registry settings.
	 *
	 * @param  baseURL to get url of specified environment
	 * @param BrowserType to pass the type of the browser needed to run test script on it (came from testngSuite.xml)
	 * @param NodeIP to pass nodeIP of machine you want to run test script on
	 * @param BrowserVersion to pass the version no. of browser
	 * @param PlatformType to pass the type of node machine platform
	 *
	 */
	@Parameters ({"baseURL","BrowserType","NodeIP","BrowserVersion","PlatformType"})
 @BeforeClass
 public void BeforeClass(String baseURL,String BrowserType ,String NodeIP,String BrowserVersion,String PlatformType){

	LoggingHandling.createNewLog();

	 if (BrowserType.equalsIgnoreCase("Firefox") || BrowserType.equalsIgnoreCase("FF"))
		{
			browserObject = CompatibilityConfig.fireFoxConfig(browserObject);
		}
		else if (BrowserType.equalsIgnoreCase("Chrome") || BrowserType.equalsIgnoreCase("CH"))
		{
			browserObject = CompatibilityConfig.chromeConfig(browserObject);
		}
		else if (BrowserType.equalsIgnoreCase("Internet Explorer") || BrowserType.equalsIgnoreCase("IE"))
		{
			browserObject = CompatibilityConfig.InternetExplorerConfig(browserObject);
		}
		else
		{
			System.out.println("Failed to Launch test Because its not mentioned browser");
		}
		pageFactoryClass =new PageFactoryClass(browserObject);
		landingPage =new LandingPage();
        addressCheckingPage =new AddressCheckingPage();
		authenticationPage =new AuthenticationPage();
		blousePage =new BlousePage();
		orderConfirmationPage =new OrderConfirmationPage();
		womenCategoryPage =new WomenCategoryPage();
		orderFinalDetailsPage =new OrderFinalDetailsPage();
		orderHistoryPage =new OrderHistoryPage();
		paymentPage =new PaymentPage();
		productDetailsPage =new ProductDetailsPage();
		registrationPage =new RegistrationPage();
		shippingPage =new ShippingPage();
		summaryPage =new SummaryPage();
		topsPage =new TopsPage();

	CompatibilityConfig.maxConfigWithSpecificSize(browserObject);
	browserObject.navigate().to(baseURL);
	 
	 
 }

	/**
	 *This method is responsible for : close the browser after tests finished
	 * we use quit not close cause close let driver run at back ground so it will consume machine resources
	 */
 @AfterClass
 public void AfterClass() {
	 browserObject.quit();

 }


	/**
	 *This method is responsible for :
	 * take screenshot when test case fail and add it in the Screenshots Directory
	 * @param result to get status and testcase name from it
	 */
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(browserObject, result.getName());

		}
	}
 

}
