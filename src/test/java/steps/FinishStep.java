  //  для связывания страниц и тестов
package steps;

import baseEntities.BaseStep_hw;
import org.openqa.selenium.WebDriver;
import pages.CheckOutOverPage;
import pages.YourCartPage;

  public class FinishStep extends BaseStep_hw {

    public FinishStep(WebDriver driver) {
        super(driver);
    }

      public CheckOutOverPage successFinish() {
          checkOutOverPage.getPayment();
          return checkOutOverPage;
      }
}