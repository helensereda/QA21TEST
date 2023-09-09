
package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductsPage;
import pages.YourCartPage;

import static baseEntities.BaseTest.driver;

public class ProductsSteps extends BaseTest  {
    private BaseTest baseTest;
    private ProductsPage productsPage;

    public ProductsSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }
    @And("user click add to cart")
    public void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(6000);
        productsPage.getAddToCardInput().click();

    }
    @And("user click shopping cart button")
    public void clickShoppingCartButton() {
        productsPage.getShoppingCartInput().click();
    }
    @Then("your cart page is displayed")
    public void isYourCartPageDisplayed() {
        Assert.assertTrue(new YourCartPage(driver).isPageOpened());
    }
}
