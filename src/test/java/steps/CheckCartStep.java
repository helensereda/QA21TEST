  //  для связывания страниц и тестов
package steps;

import baseEntities.BaseStep_hw;
import org.openqa.selenium.WebDriver;
import pages.YourCartPage;
  public class CheckCartStep extends BaseStep_hw {

    public CheckCartStep() {
        super();
    }

      public YourCartPage successCheckCart() {
          yourCartPage.checkCart();
          return yourCartPage;

      }
}