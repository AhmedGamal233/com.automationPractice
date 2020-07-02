package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;


public class BlousePage {
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilSelectedProductIsVisible(){UiActions.scrollingUntilElementVisible(PageFactoryClass.selectedProduct);}
    /**
     * click on blouses Category
     */
    public void clickOnSelectedProduct()
    {
        UiActions.clickOn(PageFactoryClass.selectedProduct);
    }
}
