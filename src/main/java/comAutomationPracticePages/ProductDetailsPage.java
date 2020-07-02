package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class ProductDetailsPage {

    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilSelectedProductIsVisible(){
        UiActions.scrollingUntilElementVisible(PageFactoryClass.addToChartButton);}
    /**
     * click on addToChartButton
     */
    public void clickOnAddToChartButton()
    {
        UiActions.clickOn(PageFactoryClass.addToChartButton);
    }
    /**
     * clickOn ProceedToCheckoutButton
     */
    public void clickOnProceedToCheckoutButton()
    { UiActions.clickOn(PageFactoryClass.proceedToCheckoutButtonOfProductDetailsPage); }
}
