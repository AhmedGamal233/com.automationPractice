package comAutomationPracticePages;

import Actions.UiActions;
import org.openqa.selenium.WebDriver;
import pageFactory.PageFactoryClass;

public class RegistrationPage {
    public WebDriver browserObject = PageFactoryClass.browserObject;

    /**
     * gender selection
     * @param gender to pass gender type
     */
    public void GenderSelection(String gender)
    {
        if(gender.equalsIgnoreCase("male=mr")) {
            UiActions.waitUntilVisability(browserObject,PageFactoryClass.male);
            UiActions.clickOn(PageFactoryClass.male);
        }else
        {
            UiActions.waitUntilVisability(browserObject,PageFactoryClass.female);
            UiActions.clickOn(PageFactoryClass.female);
        }
    }
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilFirstNameIsVisible(){UiActions.scrollingUntilElementVisible(PageFactoryClass.firstName);}
    /**
     *Enter FirstName into FirstName field
     *
     * @param FirstName to send test data to input field
     */
    public void enterFirstName(String FirstName)
    {
        UiActions.sendKeys(PageFactoryClass.firstName, FirstName);
    }

    /**
     *Enter LastName into LastName field
     *
     * @param LastName to send test data to input field
     */
    public void enterLastName(String LastName)
    {
        UiActions.sendKeys(PageFactoryClass.lastName, LastName);
    }
    /**
     *Enter password into password field
     *
     * @param password to send test data to input field
     */
    public void enterpassword(String password)
    {
        UiActions.sendKeys(PageFactoryClass.password, password);
    }
    /**
     * select  value from dropdown Menu
     * @param dayOfBirth to select day value
     */
    public void selectDay(String dayOfBirth)
    {
        UiActions.selectFromDropDownMenu(PageFactoryClass.daysDropDownMenu,dayOfBirth);
    }
    /**
     * select  value from dropdown Menu
     * @param month to select month value
     */
    public void selectMonth(String month)
    {
        UiActions.selectFromDropDownMenu(PageFactoryClass.monthsDropDownMenu,month);
    }
    /**
     * select  value from dropdown Menu
     * @param year to select year value
     */
    public void selectYear(String year)
    {
        UiActions.selectFromDropDownMenu(PageFactoryClass.yearsDropDownMenu,year);
    }
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilAddressIsVisible(){UiActions.scrollingUntilElementVisible(PageFactoryClass.address);}
    /**
     *Enter Address into Address field
     *
     * @param address to send test data to input field
     */
    public void enterAddress(String address)
    {
        UiActions.sendKeys(PageFactoryClass.address, address);
    }
    /**
     *Enter city into city field
     *
     * @param city to send test data to input field
     */
    public void enterCity(String city)
    {
        UiActions.sendKeys(PageFactoryClass.city, city);
    }
    /**
     * select  value from dropdown Menu
     * @param state to select state value
     */
    public void selectState(String state)
    {
        UiActions.selectFromDropDownMenu(PageFactoryClass.stateDropDownMenu,state);
    }
    /**
     *Enter postalCode into postalCode field
     *
     * @param postalCode to send test data to input field
     */
    public void enterPostalCode(String postalCode)
    {
        UiActions.sendKeys(PageFactoryClass.postalCode, postalCode);
    }
    /**
     * scroll until element is visible
     *
     */
    public void scrollUntilMobilePhoneIsVisible(){UiActions.scrollingUntilElementVisible(PageFactoryClass.mobilePhone);}
    /**
     *Enter mobilePhone into mobilePhone field
     *
     * @param mobilePhone to send test data to input field
     */
    public void enterMobilePhone(String mobilePhone)
    {
        UiActions.sendKeys(PageFactoryClass.mobilePhone, mobilePhone);
    }

    /**
     * click on Register button
     */
    public void clickOnRegister()
    {
        UiActions.clickOn(PageFactoryClass.registerButton);
    }

}
