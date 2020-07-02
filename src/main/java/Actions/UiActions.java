package Actions;


import Logging.LoggingHandling;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Logging.LoggingHandling.logger;

/**
 * its a helper class to make the most common actions on webElements in the frame work
 */


public class UiActions {



	/**
	 * this method is responsible for: send sequence of character to any input field takes WebElement,String
	 * @param element to pass the web element needed to interact with
	 * @param string  to pass sequence of characters to input field element
	 */

	public static void sendKeys (WebElement element ,String string) {

			element.sendKeys(string);

	}

	/**
	 * this method is responsible for: send sequence of character to any input field takes WebDriver,BY and String
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 * @param string to pass sequence of character
	 */
	public static void sendKeys (WebDriver browserObject,By by ,String string) {

			WebDriverWait wait = new WebDriverWait(browserObject,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		browserObject.findElement(by).sendKeys(string);
	}


	/**
	 * this method is responsible for: to press on any button on keyboard  takes element and key
	 * @param element to pass the web element needed to interact with
	 * @param key to pass any button on keyboard
	 */
	public static void sendKeys (WebElement element, Keys key) {
		element.sendKeys(key);
	}
	
	//click methods

	/**
	 * this method is responsible for: click on element
	 * @param element to pass the web element needed to interact with
	 */
	public static void clickOn (WebElement element)
	{

		try {

			element.click();
		}catch (Exception e)
		{
			logger.info("Error Happened cause of ElementNotInteractable");
			LoggingHandling.logError(e);
			element.submit();
		}

	}

	/**
	 * this method is responsible for: click on element
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 */
	public static void clickOn (WebDriver browserObject,By by)
	{
		try {
			WebDriverWait wait = new WebDriverWait(browserObject,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			browserObject.findElement(by).click();
		}catch (Exception e)
		{
			logger.info("Error");
			LoggingHandling.logError(e);
			browserObject.findElement(by).submit();
		}
	}
	//submit method

	/**
	 * this method is responsible for: click on element if this current element is a form
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 */
	public static void submit (WebDriver browserObject,By by)
	{
		WebDriverWait wait = new WebDriverWait(browserObject,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		browserObject.findElement(by).submit();
	}

	/**
	 * this method is responsible for: click on element if this current element is a form
	 * @param element to pass the web element needed to interact with
	 */
	public static void submit (WebElement element){
		element.submit(); }

	/**
	 * this method is responsible for: navigate to url
	 * navigate to method benefits:
	 * 1-navigates to an URL and It will not wait till the whole page gets loaded.
	 * 2-It maintains the browser history and cookies, so we can use forward and backward button to navigate between the pages during the coding of Testcase.
	 *
	 * @param browserObject to pass WebDriver
	 * @param url to pass url string to navigation method (note:be sure that url send with its protocol)
	 */
	public static void navigate (WebDriver browserObject,String url)
	{
		try {
			browserObject.navigate().to(url);
		}
		catch(Exception e){
			logger.info("Error to navigate to url");
			LoggingHandling.logError(e);
			browserObject.navigate().refresh();
		}



	}

	


	/**
	 * this method is responsible for: assert element existance
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 * @return true or false
	 */
	public static boolean findElementIsDisplyed(WebDriver browserObject,By by)
	{
	 return	browserObject.findElement(by).isDisplayed();
	}


	/**
	 * this method is responsible for: waiting until the element disappear
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 */
	public static void waitUntilInvisability (WebDriver browserObject,By by) {
		
		WebDriverWait wait = new WebDriverWait(browserObject,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	/**
	 * this method is responsible for: waiting until the element disappear
	 * @param browserObject to pass WebDriver
	 * @param element to pass the web element needed to interact with
	 */
	public static void waitUntilInvisability (WebDriver browserObject,WebElement element) {

		WebDriverWait wait = new WebDriverWait(browserObject,20);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}



	/**
	 * this method is responsible for: waiting until the element be viable
	 * @param browserObject to pass WebDriver
	 * @param element to pass the web element needed to interact with
	 */
	public static void waitUntilVisability (WebDriver browserObject,WebElement element) {
	
	WebDriverWait wait = new WebDriverWait(browserObject,20);
	wait.until(ExpectedConditions.visibilityOf(element));
}


	/**
	 * this method is responsible for: waiting until the element be viable
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 */
	public static void waitUntilVisability (WebDriver browserObject,By by) {
	
	WebDriverWait wait = new WebDriverWait(browserObject,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
}


	/**
	 * this method is responsible for: waiting until the element be clickable
	 * @param browserObject to pass WebDriver
	 * @param by to pass locator
	 */
	public static void waitUntilElementBeClickable (WebDriver browserObject,By by) {
	
	WebDriverWait wait = new WebDriverWait(browserObject,20);
	 wait.until(ExpectedConditions.elementToBeClickable(by));
}

	/**
	 * this method is responsible for: wait until element be clickable
	 * @param browserObject to pass WebDriver
	 * @param element to pass the web element needed to interact with
	 */
	public static void waitUntilElementBeClickable (WebDriver browserObject,WebElement element) {

	WebDriverWait wait = new WebDriverWait(browserObject,20);
	 wait.until(ExpectedConditions.elementToBeClickable(element));

}


	/**
	 * this method is responsible for: elements visibility method
	 * @param browserObject to pass WebDriver
	 * @param elements to pass the web element needed to interact with
	 */
	public static void waiUntilAllElementsVisable(WebDriver browserObject ,List<WebElement> elements)
	{
		WebDriverWait wait = new WebDriverWait(browserObject,20);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	/**
	 * this method is responsible for: scrolling To THE End Of THE Page
	 * @param browserObject to pass WebDriver
	 */
	public static void scrollingToEndOfPage (WebDriver browserObject) {
		((JavascriptExecutor) browserObject).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * this method is responsible for: scrolling To THE Top Of THE Page
	 * @param browserObject to pass WebDriver
	 */
	public static void scrollingToTopOfPage (WebDriver browserObject) {
		((JavascriptExecutor) browserObject).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	/**
	 * this method is responsible for: scrolling Until Element needed to interact Visible
	 * @param browserObject to pass WebDriver
	 * @param element to pass the web element needed to interact with
	 */
	public static void scrollingUntilElementVisible (WebDriver browserObject,WebElement element) {
		((JavascriptExecutor) browserObject).executeScript("arguments[0].scrollIntoView(true);", element);
		WebDriverWait wait = new WebDriverWait(((WrapsDriver)((WrapsElement)element).getWrappedElement()).getWrappedDriver(),20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void scrollingUntilElementVisible (WebElement element) {

		((JavascriptExecutor) ((WrapsDriver)((WrapsElement)element).getWrappedElement()).getWrappedDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		WebDriverWait wait = new WebDriverWait(((WrapsDriver)((WrapsElement)element).getWrappedElement()).getWrappedDriver(),20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * to select option from DropDownMenu
	 * @param dropDownMenu to pass the web element to select interface needed to interact with
	 * @param value to pass selected option string value to select it
	 */
	public static void selectFromDropDownMenu(WebElement dropDownMenu,String value )
	{
		Select drp = new Select(dropDownMenu);
		drp.selectByValue(value);
	}

}



	

