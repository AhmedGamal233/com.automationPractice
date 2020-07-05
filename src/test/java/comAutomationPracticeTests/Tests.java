package comAutomationPracticeTests;

import Actions.Helper;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * SearchResultsTests cover test scenario mentioned in the task using tentNG framework @version 7.0.0
 */

public class Tests extends BaseTest {

	//to get TestData from external file

	/**
	 * DataProvider Annotation from testing framework support data-driven testing, which allows you to automatically run a test case multiple times with different input and validation values.
	 *
	 *  When you need to pass complex parameters or parameters that need to be created from Java (complex objects, objects read from a flat files(CSV,EXCEL,Property,...) or a database, etc…).
	 *  in such cases parameters can be passed using Dataproviders.
	 *  A Data Provider is a method annotated with @DataProvider. A Data Provider returns an 2D array of objects.
	 *  using  ITestContext to get fileExtension , fileName form testngSuite.xml to run suitable file from test data file directory
	 * @param context to pass parameters (DataSizeRow,DataSizeCol,fileExtension,fileName) from testngSuite.xml to data_provider which in turn pass them to HelperClass reading data from external file
	 * @return test data to use them into my tests conncted to this data_provider method
	 *
	 */

	@DataProvider(name = "registrationData")
	public Object[][] registrationData(ITestContext context) {
		String DataSizeRow = context.getCurrentXmlTest().getParameter("DataSizeRow_2");
		String DataSizeCol = context.getCurrentXmlTest().getParameter("DataSizeCol_2");
		String fileExtension = context.getCurrentXmlTest().getParameter("fileExtension_2");
		String fileName= context.getCurrentXmlTest().getParameter("fileName_2");
		Helper.setRow(DataSizeRow);
		Helper.setCol(DataSizeCol);
		Object[][] testData= Helper.chooseFile(fileExtension,fileName);
		return testData;

	}


	/**
	 * this test for create new account
	 * @param gender   to pass firstName
	 * @param firstName to pass firstName
	 * @param lastName  to pass lastName
	 * @param password  to pass password
	 * @param day       to pass day
	 * @param month     to pass month
	 * @param year      to pass year
	 * @param address   to pass address
	 * @param city      to pass city
	 * @param state     to pass state
	 * @param postalCode to pass postalCode
	 * @param mobilePhone to pass mobilePhone
	 * @param context to pass new mail for registeration
	 *  ******************************NOTE**************************
	 *   DONT FORGIT TO CHANGE THE NEW REGISTRATION MAIL FROM testngSuite.xml file
	 */

	@Test(dataProvider = "registrationData")
	public void createNewUser(String gender, String firstName,
							  String lastName, String password, String day, String month,
							  String year, String address, String city, String state,
							  String postalCode, String mobilePhone,ITestContext context)
	{
		//landingPage.clickOnSignOutButton();
		landingPage.clickOnSignInButton();
		authenticationPage.scrollUntilRegisterMailIsVisible();
		String registrationMail = context.getCurrentXmlTest().getParameter("registrationMail");
		authenticationPage.enterRegisterMail(registrationMail);
		authenticationPage.clickOnCreateNewAccount();
		registrationPage.GenderSelection(gender);
		registrationPage.scrollUntilFirstNameIsVisible();
		registrationPage.enterFirstName(firstName);
		registrationPage.enterLastName(lastName);
		registrationPage.enterpassword(password);
		registrationPage.selectDay(day);
		registrationPage.selectMonth(month);
		registrationPage.selectYear(year);
		registrationPage.scrollUntilAddressIsVisible();
		registrationPage.enterAddress(address);
		registrationPage.enterCity(city);
		registrationPage.selectState(state);
		registrationPage.enterPostalCode(postalCode);
		registrationPage.scrollUntilMobilePhoneIsVisible();
		registrationPage.enterMobilePhone(mobilePhone);
		registrationPage.clickOnRegister();
		landingPage.clickOnSignOutButton();



	}
	@DataProvider(name = "signInData")
	public Object[][] signInData(ITestContext context) {
		String DataSizeRow = context.getCurrentXmlTest().getParameter("DataSizeRow");
		String DataSizeCol = context.getCurrentXmlTest().getParameter("DataSizeCol");
		String fileExtension = context.getCurrentXmlTest().getParameter("fileExtension");
		String fileName= context.getCurrentXmlTest().getParameter("fileName");
		Helper.setRow(DataSizeRow);
		Helper.setCol(DataSizeCol);
		Object[][] testData= Helper.chooseFile(fileExtension,fileName);
		return testData;

	}
	/**
	 * this test responsible for   validate Order Was Placed From OrderHistoryPage
	 * takes (Url , Search word) from dataProvider ,passing test data to test steps methods
	 *
	 * @param email  from dataProvider ,passing test data to test step
	 * @param password  from dataProvider ,passing test data to test step
	 */
	@Test(dataProvider = "signInData")
	public void signIN(String email ,String password)
	{
		landingPage.clickOnSignInButton();
		authenticationPage.enterAuthenticatedMail(email);
		authenticationPage.scrollUntilPasswordIsVisible();
		authenticationPage.enterPassword(password);
		authenticationPage.clickOnSignInButton();
	}

  @Test(dependsOnMethods = "signIN")
  public void validateOrderWasPlacedFromOrderHistoryPage() {

    landingPage.clickOnWomenCategory();
    womenCategoryPage.clickOnTops();
    topsPage.clickOnBlouses();
    blousePage.scrollUntilSelectedProductIsVisible();
    blousePage.clickOnSelectedProduct();
    productDetailsPage.scrollUntilSelectedProductIsVisible();
    productDetailsPage.clickOnAddToChartButton();
    productDetailsPage.clickOnProceedToCheckoutButton();
    summaryPage.scrollUntilProceedToCheckoutButtonIsVisible();
    summaryPage.clickOnProceedToCheckoutButton();
    addressCheckingPage.scrollUntilProceedToCheckoutButtonIsVisible();
    addressCheckingPage.clickOnProceedToCheckoutButton();
    shippingPage.scrollUntilAgreeOnTermsIsVisible();
    shippingPage.clickOnAgreeOnTerms();
    shippingPage.scrollUntilProceedToCheckoutButtonIsVisible();
    shippingPage.clickOnProceedToCheckoutButton();
    paymentPage.scrollUntilPayByBankWireIsVisible();
    paymentPage.clickOnPayByBankWire();
    orderConfirmationPage.scrollUntilIConfirmOnMyOrderButtonIsVisible();
    orderConfirmationPage.clickOnConfirmOnMyOrderButton();
    String orderReference=orderFinalDetailsPage.getOrderReference();
    orderFinalDetailsPage.goToOrderHistory();
    orderHistoryPage.AssertONOrderReference(orderReference);

  }
}
