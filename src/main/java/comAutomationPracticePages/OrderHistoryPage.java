package comAutomationPracticePages;

import org.testng.Assert;
import pageFactory.PageFactoryClass;

public class OrderHistoryPage {

    /**
     * to assert on all orders in orderHistory that order was placed from order history page.
     * @param orderReference to pass order reference
     */
    public void AssertONOrderReference(String orderReference)
{

    for(int i = 0; i< PageFactoryClass.Orders.size(); i++)
    {

       // String linkValue =WebElementsClass.Orders.get(i).getAttribute("innerText");

        String orderHistoryList = PageFactoryClass.Orders.get(i).getText();
       // System.out.println(orderHistoryList);
        if(orderHistoryList.contains(orderReference))
        {
            Assert.assertTrue(orderHistoryList.contains(orderReference));
        }

    }

}
}
