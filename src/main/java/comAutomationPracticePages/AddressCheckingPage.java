package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class AddressCheckingPage {

    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilProceedToCheckoutButtonIsVisible(){

        UiActions.scrollingUntilElementVisible(PageFactoryClass.proceedToCheckoutButtonOfAddressCheckingPage);}
    /**
     * click on ProceedToCheckoutButton
     */
    public void clickOnProceedToCheckoutButton()
    {
        UiActions.clickOn(PageFactoryClass.proceedToCheckoutButtonOfAddressCheckingPage);
    }
}
