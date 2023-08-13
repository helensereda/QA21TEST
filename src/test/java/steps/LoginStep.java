  //  для связывания страниц и тестов
package steps;

import baseEntities.BaseStep_hw;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;
  public class LoginStep extends BaseStep_hw {

    public LoginStep(WebDriver driver) {
        super(driver);
    }

      public ProductsPage successLogin(User user) {
          loginPage.login(user);
          return productsPage;




      }


}