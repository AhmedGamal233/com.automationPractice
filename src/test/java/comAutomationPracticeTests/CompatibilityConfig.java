package comAutomationPracticeTests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * This Class for set CompatibilityConfig for cross testing
 */
public class CompatibilityConfig extends BaseTest {
    /**
     *
     * @param browserObject to pass WebDriver
     * @return webdriver
     */
    public static WebDriver chromeConfig (WebDriver browserObject)
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        return browserObject = new ChromeDriver(options);
    }

    /**
     *
     * @param browserObject to pass WebDriver
     * @return webdriver
     */
    public static WebDriver fireFoxConfig (WebDriver browserObject)
    {
        System.setProperty("webdriver.gecko.driver","src\\test\\resources\\drivers\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        return browserObject = new FirefoxDriver(options);
    }

    /**
     *
     * @param browserObject to pass WebDriver
     * @return webdriver
     */
    public static WebDriver InternetExplorerConfig (WebDriver browserObject)
    {
        System.setProperty("webdriver.ie.driver","src\\test\\resources\\drivers\\IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.ignoreZoomSettings();
        //	options.introduceFlakinessByIgnoringSecurityDomains();
        return browserObject = new InternetExplorerDriver(options);
    }


    /**
     *
     * @param browserObject to pass WebDriver
     */
    public static void maxConfig(WebDriver browserObject)
    {
        browserObject.manage().window().maximize();
    }

    /**
     *
     * @param browserObject to pass WebDriver
     */
    public static void maxConfigWithSpecificSize(WebDriver browserObject)
    {    Dimension d = new Dimension(1024,768);
        browserObject.manage().window().setSize(d);
    }
}
