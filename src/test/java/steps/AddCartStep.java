  //  для связывания страниц и тестов
package steps;

import baseEntities.BaseStep_hw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ProductsPage;
import pages.YourCartPage;

  public class AddCartStep extends BaseStep_hw {

    public AddCartStep(WebDriver driver) {
        super(driver);
    }

      public ProductsPage addToCard() {
          loginPage.getloginButton().click();
          return productsPage;
      }
      public YourCartPage openCart() {
        productsPage.getShoppingCart().click();
        return yourCartPage;
      }


}