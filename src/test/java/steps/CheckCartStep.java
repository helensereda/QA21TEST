  //  для связывания страниц и тестов
package steps;

import baseEntities.BaseStep_hw;
import models.InfoUser;
import org.openqa.selenium.WebDriver;
import pages.CheckOutOverPage;
import pages.CheckOutPage;
import pages.YourCartPage;
  public class CheckCartStep extends BaseStep_hw {

    public CheckCartStep(WebDriver driver) {
        super(driver);
    }

      public CheckOutOverPage checkOut() {
        yourCartPage.getCheckoutButton().click();
        return checkOutOverPage;
      }


      }
