  //  для связывания страниц и тестов
package steps;
import baseEntities.BaseStep_hw;
import org.openqa.selenium.WebDriver;
import pages.CheckOutPage;

  public class AddInfoStep extends BaseStep_hw {


    public AddInfoStep() {
        super();
    }

      public CheckOutPage successInfo(String firstname, String lastname, String code) {
          checkOutPage.getInfo(firstname,lastname,code);
          return checkOutPage;
      }
  }