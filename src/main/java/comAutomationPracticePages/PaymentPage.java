package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class PaymentPage {

    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilPayByBankWireIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.payBackBankWire);}
    /**
     * click on PayByBankWire
     */
    public void clickOnPayByBankWire()
    {
        UiActions.clickOn(PageFactoryClass.payBackBankWire);
    }
}
