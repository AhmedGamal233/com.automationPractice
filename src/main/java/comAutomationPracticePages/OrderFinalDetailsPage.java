package comAutomationPracticePages;

import Actions.UiActions;
import org.apache.commons.lang3.StringUtils;
import pageFactory.PageFactoryClass;

public class OrderFinalDetailsPage {

    /**
     * to get order Reference
     * @return order preference value
     */
    public String getOrderReference(){
    String orderReference = StringUtils.substringBetween(PageFactoryClass.orderDetails.getText(), "order reference ", " in the subject of your bank wire.");
    return orderReference;
   }

    /**
     * goToOrderHistory
     */
   public void goToOrderHistory()
   {
       UiActions.scrollingUntilElementVisible(PageFactoryClass.backToOrders);
       UiActions.clickOn(PageFactoryClass.backToOrders);

   }
   //using Jsoup dependency to convert HTML Text To plain text
    //((//div[@class='box']//br)[5]//following-sibling::text())[1]
  /*  String plainText= Jsoup.parse(WebElementsClass.orderDetails.getText()).text();
    System.out.println(plainText);
    //https://www.baeldung.com/java-substring
    System.out.println(StringUtils.substringBetween(plainText, "order reference ", " in the subject of your bank wire."));
    String orderReference =StringUtils.substringBetween(plainText, "order reference ", " in the subject of your bank wire.");*/
}

