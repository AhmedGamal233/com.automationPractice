package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class ShippingPage {

    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilAgreeOnTermsIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.agreeOnTerms);}
    /**
     * click on AgreeOnTerms
     */
    public void clickOnAgreeOnTerms()
    {
        UiActions.clickOn(PageFactoryClass.agreeOnTerms);
    }

    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilProceedToCheckoutButtonIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.proceedToCheckoutButtonOfShippingPage);}
    /**
     * click on ProceedToCheckoutButton
     */
    public void clickOnProceedToCheckoutButton()
    { UiActions.clickOn(PageFactoryClass.proceedToCheckoutButtonOfShippingPage); }
}
