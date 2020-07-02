package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class OrderConfirmationPage {

    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilIConfirmOnMyOrderButtonIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.iConfirmMyOrderButton);}
    /**
     * click on ConfirmOnMyOrderButton
     */
    public void clickOnConfirmOnMyOrderButton()
    {
        UiActions.clickOn(PageFactoryClass.iConfirmMyOrderButton);
    }
}
