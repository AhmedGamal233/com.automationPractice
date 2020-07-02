package comAutomationPracticePages;

import Actions.UiActions;
import org.openqa.selenium.WebDriver;
import pageFactory.PageFactoryClass;

public class ProductDetailsPage {
    public WebDriver browserObject = PageFactoryClass.browserObject;
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
    {  UiActions.waitUntilVisability(browserObject,PageFactoryClass.proceedToCheckoutButtonOfProductDetailsPage);
        UiActions.clickOn(PageFactoryClass.proceedToCheckoutButtonOfProductDetailsPage); }
}
