package pageFactory;

import Actions.PageObjectsConfig;
import com.github.hemanthsridhar.pagefactory.FileBasedElementLocatorFactory;
import com.github.hemanthsridhar.pagefactory.SearchWithFieldDecorator;
import com.github.hemanthsridhar.support.SearchBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 *using custom page factory solution to get locators from external file with PageObjectModel
 * advantage of page factory:
 * 1- Whenever we use a WebElement, it will go and find it again so you shouldn’t see StaleElementExceptions
 * 2- On PageFactory Initialization, the proxies are configured, but the WebElements are not found that point. So we won’t get NoSuchElementException.
 * 3- robust script
 */
public class PageFactoryClass {
    /**
     * by SearchBy annotation we select locatorsFile from  PageObjectsConfig , nameOfTheLocator in json file
     */
    public static WebDriver browserObject;
    /**
     * Landing Page Elements
     */
    //@FindBy(className = "login")
    @SearchBy(locatorsFile = PageObjectsConfig.LANDING_PAGE, nameOfTheLocator = "signIn")
    public static WebElement signIn;
    //@FindBy(className = "logout")
    @SearchBy(locatorsFile = PageObjectsConfig.LANDING_PAGE, nameOfTheLocator = "signOut")
    public static WebElement signOut;
    //@FindBy(xpath="//a[@title='Women']")
    @SearchBy(locatorsFile = PageObjectsConfig.LANDING_PAGE, nameOfTheLocator = "womenCategory")
    public static WebElement womenCategory;

    /**
     * Registration Page Elements
     */
    //@FindBy(id = "id_gender1")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "male")
    public static WebElement male;

    //@FindBy(id = "id_gender2")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "female")
    public static WebElement female;

    //@FindBy(id = "customer_firstname")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "firstName")
    public static WebElement firstName;

    //@FindBy(id = "customer_lastname")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "lastName")
    public static WebElement lastName;

    //@FindBy(id = "passwd")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "password")
    public static WebElement password;

    //@FindBy(id = "days")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "daysDropDownMenu")
    public static WebElement daysDropDownMenu;

    //@FindBy(id = "months")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "monthsDropDownMenu")
    public static WebElement monthsDropDownMenu;

    //@FindBy(id = "years")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "yearsDropDownMenu")
    public static WebElement yearsDropDownMenu;

    //@FindBy(id = "address1")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "address")
    public static WebElement address;

    //@FindBy(id = "city")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "city")
    public static WebElement city;

    //@FindBy(id = "id_state")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "stateDropDownMenu")
    public static WebElement stateDropDownMenu;

    //@FindBy(id = "postcode")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "postalCode")
    public static WebElement postalCode;

    //@FindBy(id = "phone_mobile")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "mobilePhone")
    public static WebElement mobilePhone;

    //@FindBy(id = "submitAccount")
    @SearchBy(locatorsFile = PageObjectsConfig.Registration_Page, nameOfTheLocator = "registerButton")
    public static WebElement registerButton;

    /**
     * Authentication Page Elements
     */
    //@FindBy(id = "email_create")
    @SearchBy(locatorsFile = PageObjectsConfig.Authentication_Page, nameOfTheLocator = "requiredRegisterMail")
    public static WebElement requiredRegisterMail;

    //@FindBy(id = "SubmitCreate")
    @SearchBy(locatorsFile = PageObjectsConfig.Authentication_Page, nameOfTheLocator = "createAccountButton")
    public static WebElement createAccountButton;

    //@FindBy(id = "email")
    @SearchBy(locatorsFile = PageObjectsConfig.Authentication_Page, nameOfTheLocator = "signInEmailAddress")
    public static WebElement signInEmailAddress;

    //@FindBy(id = "passwd")
    @SearchBy(locatorsFile = PageObjectsConfig.Authentication_Page, nameOfTheLocator = "signInPassword")
    public static WebElement signInPassword;

    //@FindBy(id = "SubmitLogin")
    @SearchBy(locatorsFile = PageObjectsConfig.Authentication_Page, nameOfTheLocator = "signInButton")
    public static WebElement signInButton;

    /**
     * Women Page Elements
     */
    //@FindBy(xpath = "//div[@class='block_content']//following::li[@class='last'][1]/a[contains(.,'Blouses')]")
    @SearchBy(locatorsFile = PageObjectsConfig.Women_Page, nameOfTheLocator = "Tops")
    public static WebElement Tops;
    /**
     * Tops Page Elements
     */
    //@FindBy(xpath = "//div[@class='block_content']//span[@class='grower CLOSE']/following-sibling::a[contains(.,'Tops')]")
    @SearchBy(locatorsFile = PageObjectsConfig.Tops_Page, nameOfTheLocator = "blouses")
    public static WebElement blouses;

    /**
     *Blouse Page Elements
     */

    //@FindBy(xpath = "//h5[@itemprop='name']/a")
    @SearchBy(locatorsFile = PageObjectsConfig.Blouse_Page, nameOfTheLocator = "selectedProduct")
    public static WebElement selectedProduct ;

    /**
     * Product Details Page Elements
     */
    //@FindBy(name= "Submit")
    @SearchBy(locatorsFile = PageObjectsConfig.Product_Details_Page, nameOfTheLocator = "addToChartButton")
    public static WebElement addToChartButton ;
    //@FindBy(xpath = "//a[@title='Proceed to checkout']")
    @SearchBy(locatorsFile = PageObjectsConfig.Product_Details_Page, nameOfTheLocator = "proceedToCheckoutButtonOfProductDetailsPage")
    public static WebElement proceedToCheckoutButtonOfProductDetailsPage ;

    /**
     *Summary Page Elements
     */
    //@FindBy(xpath = "//p//a[@title='Proceed to checkout']")
    @SearchBy(locatorsFile = PageObjectsConfig.Summary_Locators, nameOfTheLocator = "proceedToCheckoutButtonOfSummaryPage")
    public static WebElement proceedToCheckoutButtonOfSummaryPage ;

    /**
     * Address Checking Page Elements
     */
    //@FindBy(name = "processAddress")
    @SearchBy(locatorsFile = PageObjectsConfig.Address_Checking_Locators, nameOfTheLocator = "proceedToCheckoutButtonOfAddressCheckingPage")
    public static WebElement proceedToCheckoutButtonOfAddressCheckingPage ;

    /**
     * Shipping Page Elements
     */
    //@FindBy(id = "cgv")
    @SearchBy(locatorsFile = PageObjectsConfig.Shipping_Page, nameOfTheLocator = "agreeOnTerms")
    public static WebElement agreeOnTerms ;
    //@FindBy(name = "processCarrier")
    @SearchBy(locatorsFile = PageObjectsConfig.Shipping_Page, nameOfTheLocator = "proceedToCheckoutButtonOfShippingPage")
    public static WebElement proceedToCheckoutButtonOfShippingPage ;

    /**
     * Payment Page Elements
     */
    //@FindBy(className = "bankwire")
    @SearchBy(locatorsFile = PageObjectsConfig.Payment_Page, nameOfTheLocator = "payBackBankWire")
    public static WebElement payBackBankWire ;

    /**
     * Order Confirmation Page Elements
     */
    //@FindBy(className = "button btn btn-default button-medium")
    @SearchBy(locatorsFile = PageObjectsConfig.Order_Confirmation_Page, nameOfTheLocator = "iConfirmMyOrderButton")
    public static WebElement iConfirmMyOrderButton ;

    /**
     * Order Final Details Page Elements
     */
    //@FindBy(xpath = "(//div[@class='box']//br)[5]")
    @SearchBy(locatorsFile = PageObjectsConfig.Order_Final_Details_Page, nameOfTheLocator = "orderDetails")
    public static WebElement orderDetails ;

    //@FindBy(xpath = "//a[@title='Back to orders']")
    @SearchBy(locatorsFile = PageObjectsConfig.Order_Final_Details_Page, nameOfTheLocator = "backToOrders")
    public static WebElement backToOrders ;

    /**
     * Order History Page Elements
     */
    //@FindBy(className = "color-myaccount")
    @SearchBy(locatorsFile = PageObjectsConfig.Order_History_Page, nameOfTheLocator = "orderReference")
    public static WebElement orderReference ;
    @SearchBy(locatorsFile = PageObjectsConfig.Order_History_Page, nameOfTheLocator = "Orders")
    public static List<WebElement> Orders ;




    /**
     * Constructor Injection
     * initiate page factory
     * @param driver to inject web driver to page constructor
     */
    public PageFactoryClass(WebDriver driver){
        this.browserObject=driver;
        PageFactory.initElements(new SearchWithFieldDecorator(new FileBasedElementLocatorFactory(driver)), this);
    }
}
