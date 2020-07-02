package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class SummaryPage {
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilProceedToCheckoutButtonIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.proceedToCheckoutButtonOfSummaryPage);
    }
    /**
     * click on addToChartButton
     */
    public void clickOnProceedToCheckoutButton()
    {
       UiActions.clickOn(PageFactoryClass.proceedToCheckoutButtonOfSummaryPage);
    }
}
