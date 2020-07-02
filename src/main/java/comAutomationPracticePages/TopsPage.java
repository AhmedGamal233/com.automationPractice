package comAutomationPracticePages;

import Actions.UiActions;
import pageFactory.PageFactoryClass;

public class TopsPage {

    /**
     * click on blouses Category
     */
    public void clickOnBlouses()
    {
        UiActions.clickOn(PageFactoryClass.blouses);
    }
}
