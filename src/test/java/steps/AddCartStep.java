  //  для связывания страниц и тестов
package steps;

import baseEntities.BaseStep_hw;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;
  public class AddCartStep extends BaseStep_hw {

    public AddCartStep() {
        super();
    }

      public ProductsPage successAddCart() {
          productsPage.addToCart();
          return productsPage;
      }
}