  //  для связывания страниц и тестов
package steps;
import baseEntities.BaseStep_hw;
import models.InfoUser;
import org.openqa.selenium.WebDriver;
import pages.CheckOutOverPage;
import pages.CheckOutPage;

  public class AddInfoStep extends BaseStep_hw {


      public AddInfoStep(WebDriver driver) {
          super(driver);
      }


      public CheckOutPage getInfo(InfoUser infoUser) {
          checkOutPage.getInfo(infoUser);
          return checkOutPage;
      }
      public CheckOutOverPage continueCheckout() {
          checkOutPage.getCheckButtonInput().click();
          return checkOutOverPage;
      };


  }