package comAutomationPracticePages;

import Actions.UiActions;
import org.openqa.selenium.WebDriver;
import pageFactory.PageFactoryClass;

public class LandingPage {
    public WebDriver browserObject = PageFactoryClass.browserObject;
    /**
     * click on SignIn button
     */
    public void clickOnSignInButton()
    {
        UiActions.waitUntilVisability(browserObject,PageFactoryClass.signIn);
        UiActions.clickOn(PageFactoryClass.signIn);
    }

    /**
     * click on SignOut button
     */
    public void clickOnSignOutButton()
    {
        UiActions.waitUntilVisability(browserObject,PageFactoryClass.signOut);
        UiActions.clickOn(PageFactoryClass.signOut);
    }

    /**
     * click on WomenCategory
     */
    public void clickOnWomenCategory()
    {
        UiActions.clickOn(PageFactoryClass.womenCategory);
    }

}
