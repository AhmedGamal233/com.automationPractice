package comAutomationPracticePages;

import Actions.UiActions;
import org.openqa.selenium.WebDriver;
import pageFactory.PageFactoryClass;

public class AuthenticationPage {
     public WebDriver browserObject = PageFactoryClass.browserObject;
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilRegisterMailIsVisible(){
        UiActions.waitUntilVisability(browserObject, PageFactoryClass.requiredRegisterMail);
        UiActions.scrollingUntilElementVisible(PageFactoryClass.requiredRegisterMail);}
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilAuthenticatedMailIsVisible(){

        UiActions.scrollingUntilElementVisible(PageFactoryClass.signInEmailAddress);}
    /**
     *Enter authenticatedMail into signInEmailAddress field
     *
     * @param authenticatedMail to send test data to input field
     */
    public void enterAuthenticatedMail(String authenticatedMail)
    {
        UiActions.waitUntilVisability(browserObject, PageFactoryClass.signInEmailAddress);
        UiActions.sendKeys(PageFactoryClass.signInEmailAddress, authenticatedMail);
    }
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilPasswordIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.password);}

    /**
     *Enter Password into Password field
     *
     * @param password to send test data to input field
     */
    public void enterPassword(String password)
    {
        UiActions.sendKeys(PageFactoryClass.signInPassword, password);
    }

    /**
     * click on SignIn button
     */
    public void clickOnSignInButton()
    {
        UiActions.clickOn(PageFactoryClass.signInButton);
    }

    /**
     *Enter RegisterMail into signInEmailAddress field
     *
     * @param RegisterMail to send test data to input field
     */
    public void enterRegisterMail(String RegisterMail)
    {
        UiActions.sendKeys(PageFactoryClass.requiredRegisterMail, RegisterMail);
    }
    /**
     * click on CreateNewAccount button
     */
    public void clickOnCreateNewAccount()
    {
        UiActions.clickOn(PageFactoryClass.createAccountButton);
    }
    /**
     * scroll until element is visible
     *
     */
    public void scrollRegistrationEmailAddressFieldIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.signInEmailAddress);}

}
